package javaInterveiwSample;

public class StringBasicConv {

	public static void main(String[] args) {
		String text ="Rs. 10,990.00";
		String actualValue = text.replace("[Rs. ]", "");
		System.out.println("sub1 value"+actualValue);
		double MRP = Double.parseDouble(actualValue);
		double disValue = MRP-(MRP*18)/100;
		System.out.println("The Discount value Rs."+disValue);
		
		
		

	}

}
