package javaInterveiwSample;
/*
Question 2: Write a class that has a method which adds sum of 10 numbers starting from a given
number (n) entered by user.
*/
public class Program2 {
	public int findSum(int n)
	{
		int sum = 0;
		for (int i=1;i<n;i++){
			sum = sum+i;
		}
		return sum;
		}
	public static void main(String args[]){
	
		Program2 demo = new Program2();
		int n =15;
		System.out.println("The sum uptil " + n + " is " + demo.findSum(n));
	}
}
