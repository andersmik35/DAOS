package BankAccount;

public class TestBankAccount {
    private static int turn;
    private static boolean[] flag;

    public static void main(String[] args) throws InterruptedException {
        flag = new boolean[2];
        flag[0] = false;
        flag[1] = false;
        turn = 1;

        BankAccount ba = new BankAccount();
        BankAccountTraad bat1 = new BankAccountTraad(ba);
        BankAccountTraad2 bat2 = new BankAccountTraad2(ba);

        bat1.start();
        bat2.start();

        bat1.join();
        bat2.join();

        System.out.println("Balancen er: " + ba.getBalance());
    }

    public static boolean getFlag(int i) {
        return flag[i];
    }

    public static int getTurn() {
        return turn;
    }

    public static void setFlag(int i, boolean b) {
        flag[i] = b;
    }
    public static void setTurn(int setValue){
        turn = setValue;
    }


}
