package opgave2;

public class App {
    public static void main(String[] args) {
        Common common = new Common();
        Chef chef = new Chef(common);
        Waiter waiter = new Waiter(common, "Anders");
        Waiter waiter2 = new Waiter(common, "Mads");


        chef.start();
        waiter.start();
        waiter2.start();

    }
}
