package opgave1;

public class Waiter extends Thread {
    private Common common;

    private String idNr;

    public Waiter(Common common, String idNr) {
        this.common = common;
    }

    public void run() {
        while (true){
            try {
                this.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Udleveret: "+ common.getOrderNr());
            common.countUpWaiter();


        }
    }
}
