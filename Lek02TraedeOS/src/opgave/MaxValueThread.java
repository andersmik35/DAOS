package opgave;

public class MaxValueThread extends Thread{
    private int[] row;

    private int maxValue;


    public MaxValueThread(int[] row) {
        this.row = row;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void run() {
        for (int i = 0; i < row.length; i++) {
            if (maxValue < row[i]){
                this.maxValue = row[i];
            }

        }

    }
}
