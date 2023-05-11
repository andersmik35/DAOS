package opgave3;

import java.util.Random;

public class Faelles {
    private int global = 0;

    public Faelles() {
    }

    public void tagerRandomTid(int max){
        Random r = new Random();
        int nymax = Math.abs(r.nextInt())% max +1;
        for (int i = 0; i < nymax; i++) {
            for (int j = 0; j < nymax; j++) {
                int k = j*i;
            }
        }
    }

    public int getGlobal() {
        return global;
    }

    public synchronized void kritisksection(){
        int temp;
        temp = global;
        tagerRandomTid(100);
        global = temp + 1;
    }
}
