package javaInterveiwSample;

import java.util.Scanner;

public class DaysOfweekifStat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int dayNo=scan.nextInt();
		
		if(dayNo==1){
			System.out.println("The Day is Monday");
		}
		
		else if(dayNo==2){
			System.out.println("The Day is Tuesday");
		}
		else if(dayNo==3){
			System.out.println("The Day is Wednesday");
		}
		else if(dayNo==4){
			System.out.println("The Day is Thursday");
		}
		else if(dayNo==5){
			System.out.println("The Day is Friday");
			
		}
		else if(dayNo==6){
			System.out.println("The Day is Saturday");
		}
		else if(dayNo==7){
			System.out.println("The Day is Sunday");
		}
		else{
			System.out.println("Invalid input. value between 1 to 7");
		}
	}
}
	


