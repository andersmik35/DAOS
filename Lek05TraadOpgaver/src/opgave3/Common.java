package opgave3;

public class Common {

    private int orderNr;

    private int bestillingNr;


    public synchronized void countUpWaiter() {
        if (orderNr < bestillingNr){
            orderNr++;
            notifyAll();
        }
    }

    public synchronized void countUpChef() {
        bestillingNr++;
        notifyAll();


    }

    public int getOrderNr() {
        return orderNr;
    }

    public int getBestillingNr() {
        return bestillingNr;
    }
}
