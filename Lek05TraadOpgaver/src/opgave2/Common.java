package opgave2;

import java.util.concurrent.Semaphore;

public class Common {

    private Semaphore s = new Semaphore(1);

    private int orderNr;

    private int bestillingNr;


    public void countUpWaiter() {
        try {
            s.acquire();
            if (orderNr < bestillingNr) {
                orderNr++;
            }
            s.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void countUpChef() {
        try {
            s.acquire();
            bestillingNr++;
            s.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getOrderNr() {
        return orderNr;
    }

    public int getBestillingNr() {
        return bestillingNr;
    }
}
