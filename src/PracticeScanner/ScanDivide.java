package PracticeScanner;

import java.util.Scanner;

public class ScanDivide {
	Scanner scan = new Scanner(System.in);

	double dividend, divisor; // int versions of input
	double quotient, remainder; // results of "/" and "%"

	public double divideNum(){
		System.out.println("Enter the dividend:"); // read the dividend
		dividend = scan.nextInt();

		System.out.println("Enter the divisor:"); // read the divisor
		divisor = scan.nextInt();

		quotient = dividend / divisor; // perform int math
		remainder = dividend % divisor;
		return quotient;	
		
	}
}