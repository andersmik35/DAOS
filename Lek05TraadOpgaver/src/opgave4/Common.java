package opgave4;

public class Common {

    private int orderNr;

    private int bestillingNr;


    public void countUpWaiter() {
        if (orderNr < bestillingNr){
            orderNr++;
        }
    }

    public void countUpChef() {
        bestillingNr++;


    }

    public int getOrderNr() {
        return orderNr;
    }

    public int getBestillingNr() {
        return bestillingNr;
    }
}
