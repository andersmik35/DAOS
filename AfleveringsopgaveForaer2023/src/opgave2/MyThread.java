package opgave2;

public class MyThread extends Thread{
    private String navn;
    private int thisId;
    private Faelles faelles;

    public MyThread(int thisId, String navn, Faelles faelles) {
        this.navn = navn;
        this.faelles = faelles;
        this.thisId = thisId;

    }
    public void run() {
        for (int j=0; j<100;j++) {
            int concurrentId = (thisId + 1) % 2;
            Main.setFlag(thisId, true);
            Main.setTurn(concurrentId);
            while (Main.getFlag(concurrentId) && Main.getTurn() == concurrentId) {}
            faelles.kritisksection();
            Main.setFlag(thisId,false);
            faelles.tagerRandomTid(1000);

        }

        System.out.println("Jeg er færdig: " + navn + " " + faelles.getGlobal()) ;
    }

}
