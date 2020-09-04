package circleAssignment;

public class ThisSample {
int a;
int b;
	public void setData(int a,int b){
		this.a=a;
		this.b=b;
	}
	public void showData(){
		System.out.println("Value of A ="+a);
		System.out.println("Value of b ="+a);
	}
	public static void main(String[] args) {
		ThisSample num = new ThisSample();
		num.setData(2, 3);
		num.showData();
	}

}
