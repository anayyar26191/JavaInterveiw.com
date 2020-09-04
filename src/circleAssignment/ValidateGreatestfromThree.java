package circleAssignment;

import java.util.Scanner;

public class ValidateGreatestfromThree {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number :");
		int num1= scan.nextInt();
		int num2= scan.nextInt();
		int num3= scan.nextInt();
		
		if(num1>num2 && num1>num3){
			System.out.println("Number 1 is the Greatest Number");
		}
		else if(num2>num1 && num2 >num3){
			System.out.println("Number 2 is the Greatest Number");
		}
		else{
			System.out.println("Number 3 is the Greatest Number");
			
		}
		
	}

}
