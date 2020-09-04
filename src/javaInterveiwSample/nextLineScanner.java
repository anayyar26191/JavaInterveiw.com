package javaInterveiwSample;

import java.util.Scanner;

public class nextLineScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in );
	    int num, square,sum;      // declare two int variables 

	    System.out.println("Enter an integer:");
	    num = scan.nextInt();
	    square = num * num ;  // compute the square 

	    System.out.println("The square of " + num + " is " + square);
	   
	    System.out.println("Enter an integer:");
	    num = scan.nextInt();
	    sum=num+1;
	    System.out.println("The sum of " + num + " is " + sum);
		   
	    
	    
	}

}

