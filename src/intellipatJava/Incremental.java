package intellipatJava;

public class Incremental {

	public static void main(String[] args) {
		int a=20;
		System.out.println("Current Value of a is :"+a);
		System.out.println("after a++ Value of a is :"+(a++));
		System.out.println("Now Value of a is :"+a);
		System.out.println("Current Value of a is :"+(++a));
		System.out.println("After ++a Value of a is :"+a);
		System.out.println("Current Value of a is :"+(a--));
		System.out.println("After a-- Value of a is :"+a);
		System.out.println("Current Value of a is :"+(--a));
		System.out.println("CAfter --a Value of a is :"+a);
		
		System.out.println("Logical complemnet operator:");
		boolean isCorrect = true;
		System.out.println("isCorrect :"+(!isCorrect));
	}

}
