package bankData;

public class BankRunner {
	static BankVariables icici;
	public static void main(String[] args) {
		BankVariables hdfc = new BankVariables();
		icici =new BankVariables();
		hdfc.setBankName("ICICI");
		hdfc.setContactName(12);
		hdfc.setCarLoanOfInterest(100.22);
		System.out.println(hdfc.getContactName());
		System.out.println(hdfc.getCarLoanOfInterest());
		System.out.println(hdfc.getIFSC());
		System.out.println(hdfc.isWorking());
		System.out.println(hdfc.getRateOfInterest());
		System.out.println("icici");
		System.out.println(hdfc.bankName);
		hdfc.bankName ="HDFC";
		System.out.println(hdfc.bankName);
		icici.bankName="icici";
		System.out.println(icici.bankName);
		System.out.println(icici);
		System.out.println(hdfc);
		hdfc.createAccount();
		int newBalance=hdfc.withdrawMoney(26000);
		System.out.println("The new balance is "+newBalance);
		
	}

}
