package opgave3;

public class MyThread extends Thread{
    private Faelles faelles;

    /**
     * Konstrukter for klassen MyThread
     * @param navn
     * @param faelles
     */

    public MyThread(String navn, Faelles faelles) {
        super(navn);
        this.faelles = faelles;

    }

    /**
     * Metode der kører tråden
     */
    public void run() {
        for (int j=0; j<100;j++) {
            faelles.kritisksection();
            faelles.tagerRandomTid(1000);
        }
        System.out.println("Jeg er færdig: " + super.getName() + " " + faelles.getGlobal()) ;
    }

}
