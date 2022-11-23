package ExceptionHandling;

import java.util.Scanner;

public class TryCatch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Division\n");
		System.out.println("Enter two number\n");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int c;
		try {
			c = A / B;
			System.out.println("division of two number\n" + c);
		} catch (ArithmeticException E) {
			System.out.println(E);
		}

		System.out.println("Code Complete");
	}
}
