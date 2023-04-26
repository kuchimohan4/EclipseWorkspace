package bank1;


public class bankaccount {
	
	private int id;
	private String name;
	private double balance;
	private boolean isCurrent;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public bankaccount(int id, String name, double balance,boolean isCurrent) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.isCurrent=isCurrent;
		
	}
	public boolean getIsCurrent() {
		return isCurrent;
	}
	public void setCurrent(boolean isCurrent) {
		this.isCurrent = isCurrent;
	}
	
	
	

}
