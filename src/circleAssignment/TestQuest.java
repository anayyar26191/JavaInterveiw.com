package circleAssignment;

public class TestQuest {

	public static void main(String[] args) {
		shiftInt();
		stringBoolean();
	}
		
	public static void shiftInt(){	
	int x = 20;
		System.out.println(x << 1);
		int y = 10;
		System.out.println(y >> 1);
/*
 *ShiftKey >>  n*2

ShiftKey <<   n/2
 * 
 * 
 */
	}

	public static void stringBoolean() {
		String s1 = "WelcomeJava";
		String s2 = "WelcomeJava";
		System.out.println("s1 == s2 is:" + s1 == s2);
		
	}
}
