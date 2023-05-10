package semafor1;

public class TestBankAccount {

	public static void main(String[] args) throws InterruptedException {
		BankAccount ba = new BankAccount();
			BankAccountTraad bat1 = new BankAccountTraad(ba);
			BankAccountTraad2 bat2 = new BankAccountTraad2(ba);
			
			bat1.start();
			bat2.start();

			bat1.join();
			bat2.join();

			System.out.println("Balancen er: " + ba.getBalance());

		}
}
