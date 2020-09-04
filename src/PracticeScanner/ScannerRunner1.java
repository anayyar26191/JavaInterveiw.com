package PracticeScanner;

public class ScannerRunner1 {

	public static void main(String[] args) {
		ScannerAdding2Num addNum = new ScannerAdding2Num();
		addNum.AddingTwoNum();
		
		ScanDivide divide1 = new ScanDivide();
		double result=divide1.divideNum();
		System.out.println(result);
	}
	
}
