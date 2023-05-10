package opgave3;

public class Main {
    public static void main(String[] args) {
        Faelles faelles = new Faelles();
        MyThread t1 = new MyThread("t1", faelles);
        MyThread t2 = new MyThread("t2", faelles);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
            System.out.println("Global: " + faelles.getGlobal());
        } catch (InterruptedException e) {
        }
    }
}
