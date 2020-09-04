package javaInterveiwSample;

import java.util.Scanner;

public class Scanner2 {

	public void dataInfo() {
		System.out.println("Throws Exception If Number is of Type Long.");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your rollno: ");
		int rollno = scanner.nextInt();
		System.out.println("RollNumber: " + rollno);
		// Close the scanner
		scanner.close();
		System.out.println("Scanner Closed.");
	}
	public void echo(){
		String inData;
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the Data :");
		inData = scan2.nextLine();
		System.out.println("You Entered :"+inData);		
			
	}
	
}
