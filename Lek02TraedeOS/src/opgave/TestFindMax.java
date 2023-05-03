package opgave;

import java.util.HashSet;
import java.util.Random;

public class TestFindMax {
    private static final int rowindex = 2;
    private static final int colindex = 200;
    private static int[][] board = new int[rowindex][colindex];

    public static void main(String[] args) {
        fillBoard();
        printBoard();
        long l1 = System.nanoTime();
        System.out.println("Max: " + findMax());
        try {
            System.out.println("Max: " +
                    findMaxThread());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long l2 = System.nanoTime();
        System.out.println("Køretiden var " + (l2 - l1) / 1000000
                + " millisekunder");
    }

    public static int findMax() {
        int max = board[0][0];
        for (int[] row : board) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;

    }

    public static int findMaxThread() throws InterruptedException {
        int maxValue = Integer.MIN_VALUE;
        HashSet<MaxValueThread> threads = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            MaxValueThread thread = new MaxValueThread(board[i]);
            thread.start();
            threads.add(thread);
        }
        for (MaxValueThread thread : threads) {
            thread.join();
            if (thread.getMaxValue() > maxValue) {
                maxValue = thread.getMaxValue();
            }
        }
        return maxValue;
    }


    public static int maxAmountOfThreads(int maxThreads) throws InterruptedException {
        int maxValue = Integer.MIN_VALUE;
        HashSet<MaxValueThread> threads = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            MaxValueThread thread = new MaxValueThread(board[i]);
            thread.start();
            threads.add(thread);
        }
        for (MaxValueThread thread : threads) {
            thread.join();
            if (thread.getMaxValue() > maxValue) {
                maxValue = thread.getMaxValue();
            }
        }
        return maxValue;
    }



    public static void fillBoard() {
        Random rand = new Random();
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length;
                 col++) {
                board[row][col] = rand.nextInt(1000);
            }
        }
    }

    public static void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}



