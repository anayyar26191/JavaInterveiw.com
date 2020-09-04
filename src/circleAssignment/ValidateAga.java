package circleAssignment;

import java.util.Scanner;

public class ValidateAga {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter your User Age");
		int userAge = scan1.nextInt();
		if (userAge > 18) {
			System.out.println("User Driving License can be created");
		} else {
			System.out.println("User Not Eligible");
		}
	}

}
