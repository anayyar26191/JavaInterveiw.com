package Practice1;

import java.util.*;

import javaInterveiwSample.Scanner2;

public class Scanner_demo {

	public static void main(String[] args) {

	Random rand;
	 System.out.println("Throws Exception If Number is of Type Long.");  
     Scanner scanner = new Scanner(System.in);        
     System.out.print("Enter your rollno: ");    
     int rollno = scanner.nextInt();    
       System.out.println("RollNumber: "+rollno);   
       //Close the scanner  
       scanner.close();  
       System.out.println("Scanner Closed.");   
	rand =new Random();
	Integer value = new Integer( 103 );    // hold the value 103 
    // inside an Integer object
Double dvalue = new Double( -32.78 );  // hold a double precision 
    // value inside a Double object

System.out.println( "Integer object holds: " + value );
System.out.println( "Double  object holds: " + dvalue );   

	}

}
