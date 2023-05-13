package opgave2;

public class Main {
    private static int turn;
    private static boolean[] flag;

    public static void main(String[] args) {
        flag = new boolean[2];
        flag[0] = false;
        flag[1] = false;
        turn = -1;
        Faelles faelles = new Faelles();
        MyThread t1 = new MyThread(0, "t1", faelles);
        MyThread t2 = new MyThread(1, "t2", faelles);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
            System.out.println("Global: " + faelles.getGlobal());
        } catch (InterruptedException e) {
        }
    }

    /**
     * Metode der returnerer flaget for tråden
     * @param i
     * @return
     */
    public static boolean getFlag(int i) {
        return flag[i];
    }

    /**
     * Metode der returnerer turn
     *
     * @return
     */
    public static int getTurn() {
        return turn;
    }

    /**
     * Metode der sætter flaget for tråden
     *
     * @param i
     * @param b
     */
    public static void setFlag(int i, boolean b) {
        flag[i] = b;
    }

    /**
     * Metode der sætter turn
     *
     * @param setValue
     */
    public static void setTurn(int setValue) {
        turn = setValue;
    }
}
