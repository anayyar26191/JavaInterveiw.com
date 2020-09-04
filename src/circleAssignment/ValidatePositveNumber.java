package circleAssignment;

import java.util.Scanner;

public class ValidatePositveNumber {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = scan.nextInt();
		if(num>0){
			System.out.println("Its a Positive Number");
		}
		else{
			System.out.println("Its a Negative Number");
		}
		
	}

}
