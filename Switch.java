package TodayTask;

import java.util.Scanner;

public class Switch {
	public static void main(String args[]) {

		System.out.println("1 Area of circle");
		System.out.println("2 Area of Rectangle");
		System.out.println("3 Area of Square");
		System.out.println("4 Area of triangle");
		System.out.println("\nplease choose from 1-4 and enter \n");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		switch (s) {
		case 1:
			final float pi = 3.14f;
			System.out.println("Area of circle");

			System.out.println("please enter the radius of circle");

			float radius = sc.nextFloat();
			float AreaofCircle = pi * radius * radius;
			System.out.println("Area of Circle is :" + AreaofCircle);
			break;
		case 2:
			System.out.println("Area of Rectangle");
			System.out.println("please enter the length of triangle");

			int length = sc.nextInt();
			System.out.println("please enter the breadth of triangle");
			int breadth = sc.nextInt();
			int AreaofRectangle = length * breadth;
			System.out.println("Area of Rectangle is:" + AreaofRectangle);
			break;

		case 3:
			System.out.println("Area of Square");
			System.out.println("please enter the  side");

			int side = sc.nextInt();
			int AreaofSquare = side * side;
			System.out.println("Area of Square is:" + AreaofSquare);
			break;
		case 4:
			System.out.println("Area of triangle");
			System.out.println("please enter the heigth");
			int height = sc.nextInt();
			System.out.println("please enter the breadth");
			int k = sc.nextInt();
			int f = k * height;
			System.out.println("Area of traingle is:" + f);
			break;
		default:
			System.out.println("getting wrong input");
		}

	}
}
