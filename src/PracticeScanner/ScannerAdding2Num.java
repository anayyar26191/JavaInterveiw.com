package PracticeScanner;

import java.util.Scanner;

public class ScannerAdding2Num {
	int first,second,sum;
public void AddingTwoNum(){
	Scanner scan1 = new Scanner(System.in);
	System.out.println("Enter First number :");
	first = scan1.nextInt();
	System.out.println("Enter Second number :");
	second =scan1.nextInt();
	sum =first+second;
	System.out.println("The Sum of two number is :"+sum);
}
	
}
