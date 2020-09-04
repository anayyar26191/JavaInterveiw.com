package bankData;

public class Account {
 char accountType;
 String accountNumber;
 public String createAccount(String KYCdocument,char accountType){
	 //Passport  and Driver'sLicense
	 //accountType  S and C
	 if(validatecountType(accountType) && validateKYCDocument(KYCdocument)){
		 accountNumber=accountType+"013322";
		 return accountNumber;
	 }else{
		 
		 System.out.println("Account cannot be created!!!");
		 return null;
	 }
	
 }
 
 private boolean validateKYCDocument(String KYCdocument){		 
	 if(KYCdocument.equalsIgnoreCase("Passport") || KYCdocument.equalsIgnoreCase("Driver'sLicense"))
	 {
		 
	 return true;
 }else{
	 
	 System.out.println("KYC doccument Error!!(Passport or Driver'sLicense)");
	 return false;
}
 }
 private boolean validatecountType(char accountType){
	
if(accountType=='C'|| accountType =='S'){
	return true;
}
else{
	System.out.println("Account Type Error!!(Saving or Current only)");
	return false;
}
}
 
}