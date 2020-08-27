package Practice1;

public class Stringsampel {

	public static void main(String[] args) {
		 String str;
		    int    len;

		    str = new String( "Elementary, my dear Watson!" );

		    len = str.length();    // call the length() method of the object

		    System.out.println("The length is: " + len );
		    String str1 = new String( "Golf is a good walk spoiled." ); // create the original object

		    String sub = str1.substring(8); //create a new object from the original

		    System.out.println( sub );
		    java.lang.String str2;
		    int len2;

		    str2 = new java.lang.String( "Elementary,my dear Watson!" );

		    len2 = str2.length();
		    System.out.println("The length is: " + len2 );
		   	}

}
