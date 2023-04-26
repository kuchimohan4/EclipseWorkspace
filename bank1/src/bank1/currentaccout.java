package bank1;

public class currentaccout extends bankaccount {

	

	private double overDraftLimit;
	private double currentOverDraft;
	public double getOverDraftLimit() {
		return overDraftLimit;
	}
	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	public double getCurrentOverDraft() {
		return currentOverDraft;
	}
	public void setCurrentOverDraft(double currentOverDraft) {
		this.currentOverDraft = currentOverDraft;
	}
	public currentaccout(int id, String name, double balance,boolean isCurent, double overDraftLimit) {
		super(id, name, balance,isCurent);
		this.overDraftLimit = overDraftLimit;
		this.currentOverDraft = 0;
	}
	public currentaccout(int id, String name, double balance,boolean isCurent) {
		super(id, name, balance,isCurent);
		
	}

	
	
	
	

}
