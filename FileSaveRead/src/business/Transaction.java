package business;
public class Transaction {
	public Transaction(String type, double amount) {
		this.type = type;
		this.amount = amount;
	}
	private String type;
	private double amount;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
