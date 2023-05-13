package opgave2;

import java.util.Random;

public class Faelles {
    private int global = 0;

    /**
     * Konstrukter for klassen Faelles
     */
    public Faelles() {
    }
    /**
     * Metode der tager random tid så simuleringen af en kritisk section kan køre
     *
     * @param max
     */
    public void tagerRandomTid(int max){
        Random r = new Random();
        int nymax = Math.abs(r.nextInt())% max +1;
        for (int i = 0; i < nymax; i++) {
            for (int j = 0; j < nymax; j++) {
                int result = i + j + i * j;
            }
        }
    }

    /**
     * Metode der returnerer global
     *
     * @return
     */
    public int getGlobal() {
        return global;
    }

    /**
     * Metode der sætter global
     */

    public void kritisksection(){
        int temp;
        temp = global;
        tagerRandomTid(1000);
        global = temp + 1;
    }
}
