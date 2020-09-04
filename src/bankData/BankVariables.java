package bankData;

public class BankVariables {
	// member variables
	private int contactName;
	private boolean isWorking;
	private float rateOfInterest;// Float value make sure to put f
	private double carLoanOfInterest;
	private char IFSC;
	String bankName;// series of characters use string

	public int getContactName() {
		return contactName;
	}

	public void setContactName(int contactName) {
		this.contactName = contactName;
	}

	public boolean isWorking() {
		return isWorking;
	}

	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}

	public float getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public double getCarLoanOfInterest() {
		return carLoanOfInterest;
	}

	public void setCarLoanOfInterest(double carLoanOfInterest) {
		this.carLoanOfInterest = carLoanOfInterest;
	}

	public char getIFSC() {
		return IFSC;
	}

	public void setIFSC(char iFSC) {
		IFSC = iFSC;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	// methods
	public void createAccount() {
		System.out.println("Account Created");

	}

	public int withdrawMoney(int amount) {
		System.out.println("Processing ....");

		int bankBalance = 10000;// local variables
		if (amount > bankBalance) {
			System.out.println("Invalid Amount! Please check your balance");

		} else {
			if (amount > 0) {
				bankBalance = bankBalance - amount;
				return bankBalance;
			} else {
				System.out.println("invalid ");
			}
		}
		return 0;
	}

	public void addEmployee() {

	}
}