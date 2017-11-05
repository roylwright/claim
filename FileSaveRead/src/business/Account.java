package business;
import java.util.ArrayList;

public class Account {
	private double balance;
	private double deposit;
	private double withdraw;
	private ArrayList<Transaction> transaction = new ArrayList<>();
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		Transaction t1 = new Transaction("deposit", deposit);
		transaction.add(t1);
	}
	public double getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(double withdraw) {
		Transaction t1 = new Transaction("wothdrawal", withdraw);
		transaction.add(t1);
	}
	public ArrayList<Transaction> getTransaction() {
		return transaction;
	}
	public void setTransaction(ArrayList<Transaction> transaction) {
		this.transaction = transaction;
	}
}
