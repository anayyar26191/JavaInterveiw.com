package javaInterveiwSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program1 {
	public int findSum(int a,int b){
		int sum = a+b;
		return sum;
	}
	public static void main(String args[]) throws NumberFormatException, IOException{
		InputStreamReader ir =new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(ir);
		System.out.println("Enter first number");
		int num1 =Integer.parseInt(br.readLine());
		System.out.println("Enter Second number");
		int num2 =Integer.parseInt(br.readLine());
		Program1 demo = new Program1();
		int sum =demo.findSum(num1, num2);
		System.out.println("The sum of " + num1 + " and "+ num2 + " is = " + sum);
		
	}
	
}
