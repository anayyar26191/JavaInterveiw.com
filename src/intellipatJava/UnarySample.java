package intellipatJava;

public class UnarySample {

	public static void main(String[] args) {
		boolean varTrue = true;
		boolean varFalse = false;
		int i=40;
		
		System.out.println("True && True is:"+(varTrue && varTrue));
		System.out.println("True && False is:"+(varTrue && varFalse));
		
		System.out.println("True || True is:"+(varTrue || varTrue));
		System.out.println("False || True is:"+(varFalse || varTrue));
		
		System.out.println("Ternary Demo :"+(i==30 ? i:"Sorry wrong number"));
		System.out.println("Ternary Demo :"+(i<30 ? i:"I is greater"));
		
		byte j = 31;
		//Left shift << A single left shift multiplies a binary number by 2:
		System.out.println("Left shift of j :"+(j<<2));
		//Right shift n/2  a single logical right shift divides a number by 2, throwing out any remainders.
		System.out.println("Left shift of j :"+(j>>2));
	}

}
