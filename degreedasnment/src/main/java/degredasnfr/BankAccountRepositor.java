package degredasnfr;

public interface BankAccountRepositor {
	public double getBalance(long accountId) ;
	
	public double updateBalance(long accountId,double newBalance) ;
}
