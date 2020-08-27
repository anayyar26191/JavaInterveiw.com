package Practice1;

public class ExpressionAdvance {

	public static void main(String[] args) {
		
		  {
			System.out.println("The result is: " + (1/2 + 1/2));
			System.out.println("The result is: " + (1.0/2 + 1/2));
			System.out.println("The result is: "+(1/2.0 + 1/2));
			System.out.println("The result is: "+(1/2 + 1.0/2.0));
			System.out.println("The result is: "+(1/2.0 + 1.0/2.0));
			System.out.println(99/100);
			System.out.println(12/3);
			System.out.println(-10/5);
			System.out.println(129/100);
			System.out.println(17/2);
			System.out.println(-12/3);
			System.out.println(10/-6);
			System.out.println(-19/-10);
			System.out.println(-19/2);
			System.out.println(3/4);
			int a=(int) ((1/2+3.5)/2.0);
			System.out.println(a);
			System.out.println(( 1/2 + 3.5 ) / 2.0);
			int b =6;
			double c = 12.0;
			//int d=(a/b+4) /2)); not working
			int quotient, remainder;

		    quotient  =  17 / 3;
		    remainder =  17 % 3;
		    
		    System.out.println("The quotient : " + quotient );
		    System.out.println("The remainder: " + remainder );
		    System.out.println("The original : " + (quotient*3 + remainder) );
//	 If you exchange 372 pennies for dollar bills, how many bills do you get? How many pennies are left over?
		int dollars =372/100;
		int leftover =372%100;
		System.out.println(dollars);
		System.out.println(leftover);
		System.out.println(7%3);
		System.out.println(1999%100);
		int x=3;
		int y =x%2;
		System.out.println(y);
		// Five pirates find a chest of 123 gold coins and wish to divide the 123 coins evenly amoung themselves. How many coins does each pirate get?

//The parrot gets any leftover coins. How many coins does the parrot get? 
		int z=123/5;//coins
		int z1=123%5;//leftover
		System.out.println(z);
		System.out.println(z1);
		
		 final double DURABLE = 0.045;
		 final double NONDURABLE = 0.038;
		 double gross=4000;
		double taxamount = gross * DURABLE ;
		System.out.println(taxamount);
		
		  }

	}

}
