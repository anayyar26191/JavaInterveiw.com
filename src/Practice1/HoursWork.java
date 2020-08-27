package Practice1;

public class HoursWork {

	public static void main(String[] args) {
		long payAmount;
		long hoursWorked1 = 40;
		double payRate = 10.0, taxRate = 0.10;

		System.out.println("Hours Worked :" + hoursWorked1);
		System.out.println("pay Amount :" + (hoursWorked1 * payRate));
		System.out.println("tax Amount :" + (hoursWorked1 * payRate * taxRate));

		payAmount = 123;
		System.out.println("The variable contains :" + payAmount);
		int quantity = 7;
		int extra = 5;
		quantity = extra + 13;
		System.out.println("quatity holds :" + quantity);
		int value = 5;
		System.out.println("value is :" + value);

		value = value + 10;
		System.out.println("Value is :" + value);

		// counts
		int count = 0;
		System.out.println(count);
		for (count = 0; count <= 10;) {

			System.out.println(count);
			count = count + 1;
		}

		// sum
		int sum = 1;
		sum = 2 * sum;
		System.out.println(sum);
		int y = 12 - 4 / 2 + 2;
		System.out.println(y);
		int a = 5 / 2;
		System.out.println(a);
		double b = 5.0 / 2.0; // why cannot be float
		System.out.println(b);
		a = 16 - 12 / 4;
		b = 16 - 12 / 4 / 3;
		System.out.println(a);
		System.out.println(b);
		int c = (int) (16 - b);
		System.out.println(c);
		int d = 24 / 2 - 8;
		System.out.println(d);
		int e = 2 + 4 / 3 + 3;
		System.out.println(e);
		float g = (float) (2.02 + 3.02);
		System.out.println(g);
		double h = 2.9001 + 3009;
		System.out.println(h);
		int i = 24 + 3 * -4;
		System.out.println(i);
		int j = -1 * (9 - 2) * 3;
		System.out.println(j);
		


	}

	}
