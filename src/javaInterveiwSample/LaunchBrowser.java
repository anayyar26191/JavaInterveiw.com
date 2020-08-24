package javaInterveiwSample;

public class LaunchBrowser {

	public static void main(String[] args) {
		String browsername = "ChrOme";
		if (browsername.equalsIgnoreCase("chrome")) {
			System.out.println("Launch Chrome Browser");
		} else if (browsername.equalsIgnoreCase("IE")) {
			System.out.println("Launch Chrome IE");
		} else if (browsername.equalsIgnoreCase("Firefox")) {
			System.out.println("Launch Chrome FireFox");
		} else {
			System.out.println("No browser launch");
		
		}
	}
}
