package TodayTask;

import java.util.Scanner;

public class AllShapesArea {
	final float pi = 3.14f;
	Scanner sc = new Scanner(System.in);
	int breadth;

	void AreaofCircle() {
		System.out.println("Area of circle");

		System.out.println("please enter the radius of circle");

		float radius = sc.nextFloat();
		float AreaofCircle = pi * radius * radius;
		System.out.println("Area of Circle is :" + AreaofCircle);
	}

	void AreaofRectangle() {
		System.out.println("Area of Rectangle");
		System.out.println("please enter the length of triangle");

		int length = sc.nextInt();
		System.out.println("please enter the breadth of triangle");
		breadth = sc.nextInt();
		int AreaofRectangle = length * breadth;
		System.out.println("Area of Rectangle is:" + AreaofRectangle);

	}

	void AreaofSquare() {
		System.out.println("Area of Square");
		System.out.println("please enter the  side");

		int side = sc.nextInt();
		int AreaofSquare = side * side;
		System.out.println("Area of Circle is:" + AreaofSquare);
	}

	void AreaofTriangle() {
		System.out.println("Area of triangle");
		System.out.println("please enter the heigth");
		int height = sc.nextInt();
		int f = breadth * height;
		System.out.println("Area of traingle is:" + f);

	}

	public static void main(String args[]) {
		AllShapesArea A1 = new AllShapesArea();
		A1.AreaofCircle();
		A1.AreaofRectangle();
		A1.AreaofSquare();
		A1.AreaofTriangle();
	}
}
