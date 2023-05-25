package opgave1;

public class Chef extends Thread{

    private Common common;

    public Chef(Common common) {
        this.common = common;
    }

    public void run() {
        while (true){
            try {
                this.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Bestilling: " + common.getBestillingNr());
            common.countUpChef();

        }
    }
}
