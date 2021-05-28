package math;

import java.util.Scanner;

public class Library {
	public static void main(String args[]) {
		System.out.println("Enter the number of figure");
		System.out.println("1 = Triangle");
		System.out.println("2 = Square");
		System.out.println("3 = Circle");
		System.out.println("4 = Right Triangle");
		System.out.println("5 = Rectangular");
		Scanner sc = new Scanner(System.in);

		int figure = sc.nextInt();
		
		switch (figure) {
		case (1):
		
			TriangleSquareImpl triangleArea = new TriangleSquareImpl();
		triangleArea.process();
			break;

		case (2):
			
			Square squareArea = new Square();
		squareArea.process();
			break;

		case (3):
			
			CircleSquareImpl circleArea = new CircleSquareImpl();
		circleArea.process();
			break;

		case (4):
			RightTriangle rtArea = new RightTriangle();
		rtArea.process();
			break;

		case (5):
			
			Rectangular rectangularArea = new Rectangular();
		rectangularArea.process();
			break;
			
		default: break;
		}
		


		sc.close();
	}

}