package circleAssignment;

import java.util.Scanner;

public class AssignmentScan {

	public static void main(String[] args) {
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter your Name :");
		String name = scan1.nextLine();
		System.out.println("Enter your Age");
		int age = scan1.nextInt();
		System.out.println("Enter Gender");
		char gender=scan1.next().charAt(0);
		String adress;
		String emailId;
		System.out.println("Enter Contact Number");
		String contactNum = scan1.next();
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Gender :"+gender);
		System.out.println("Contact Number :"+contactNum);
		
		 
	}

}
