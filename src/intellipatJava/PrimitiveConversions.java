package intellipatJava;

public class PrimitiveConversions {

	public static void main(String[] args) {
		wideningMethod();
		narrowingMethod();
	}
	
	public static void wideningMethod(){
		float floatNum = 23.22f;
		double doubleNum=(double)floatNum;
		System.out.println("FloatVar  :"+floatNum+"Double Var :"+doubleNum);
			
		}
	public static void narrowingMethod(){
		long longNum = 300000000000L;
		int intNum = (int)longNum;
		
		System.out.println("LongVNum  :"+longNum+"Int Num :"+intNum);
			
		}
	
	}
	


