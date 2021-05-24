package MathJava;

import java.util.ArrayList;
import java.util.List;
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
		List<Double> paramList = new ArrayList<>();

		switch (figure) {
		case (1):
			Scanner sc1 = new Scanner(System.in);

			System.out.println("Enter the a side of triangle");
			double aTriangle = sc1.nextDouble();
			paramList.add(aTriangle);

			System.out.println("Enter the b side of triangle");
			double bTriangle = sc1.nextDouble();
			paramList.add(bTriangle);

			System.out.println("Enter the c side of triangle");
			double cTriangle = sc1.nextDouble();
			paramList.add(cTriangle);

			TriangleSquareImpl triangleArea = new TriangleSquareImpl();
			double resultTriangle = triangleArea.square(paramList);

			triangleArea.square(paramList);

			System.out.println("Area of triangle = " + resultTriangle);
			sc1.close();
			break;

		case (2):
			System.out.println("Enter the a side of square");
    	
    	Scanner sc2 = new Scanner(System.in);
    	
    		
        Double aSquare = sc2.nextDouble();
        
        
        paramList.add(aSquare);
        	Square squareArea = new Square();
        	double resultSquare = squareArea.square(paramList);
        	
        	squareArea.square(paramList/*Arrays.asList(aSquare)*/);
        	System.out.println("Area of square = " + resultSquare);
        	
       sc2.close();    
			break;

		case (3):
			Scanner sc3 = new Scanner(System.in);

		System.out.println("Enter the r (radius) of circle");
		double rCircle = sc3.nextDouble();

		paramList.add(rCircle);
		CircleSquareImpl circleArea = new CircleSquareImpl();
		double resultCircle = circleArea.square(paramList);

		circleArea.square(paramList);
		System.out.println("Area of circle = " + resultCircle);
		sc3.close();
			break;

		case (4):
			Scanner sc4 = new Scanner(System.in);

		System.out.println("Enter the a side of Right Triangle");
		double aRT = sc4.nextDouble();

		paramList.add(aRT);
		RightTriangle rtArea = new RightTriangle();
		double resultRT = rtArea.square(paramList);

		rtArea.square(paramList);
		System.out.println("Area of circle = " + resultRT);
		sc4.close();
			break;

		case (5):
			Scanner sc5 = new Scanner(System.in);

		System.out.println("Enter the a side of Rectangular");
		double aRect = sc5.nextDouble();
		paramList.add(aRect);

		System.out.println("Enter the b side of Rectangular");
		double bRect = sc5.nextDouble();
		paramList.add(bRect);

		Rectangular rectangularArea = new Rectangular();
		double resultRectangular = rectangularArea.square(paramList);

		rectangularArea.square(paramList);
		System.out.println("Area of circle = " + resultRectangular);
		sc5.close();
			break;
		}

		//if (figure == 1) {

			/*
			 * Scanner sc1 = new Scanner(System.in);
			 * 
			 * System.out.println("Enter the a side of triangle"); double aTriangle =
			 * sc1.nextDouble(); paramList.add(aTriangle);
			 * 
			 * System.out.println("Enter the b side of triangle"); double bTriangle =
			 * sc1.nextDouble(); paramList.add(bTriangle);
			 * 
			 * System.out.println("Enter the c side of triangle"); double cTriangle =
			 * sc1.nextDouble(); paramList.add(cTriangle);
			 * 
			 * TriangleSquareImpl triangleArea = new TriangleSquareImpl(); double
			 * resultTriangle = triangleArea.square(paramList);
			 * 
			 * triangleArea.square(paramList);
			 * 
			 * System.out.println("Area of triangle = " + resultTriangle); sc1.close();
			 */
		//}

		//else if (figure == 2) {
			/*
			 * System.out.println("Enter the a side of square");
			 * 
			 * Scanner sc2 = new Scanner(System.in);
			 * 
			 * 
			 * Double aSquare = sc2.nextDouble();
			 * 
			 * 
			 * paramList.add(aSquare); Square squareArea = new Square(); double resultSquare
			 * = squareArea.square(paramList);
			 * 
			 * squareArea.square(paramListArrays.asList(aSquare));
			 * System.out.println("Area of square = " + resultSquare);
			 * 
			 * sc2.close();
			 */
		//}

		//else if (figure == 3) {

			/*
			 * Scanner sc3 = new Scanner(System.in);
			 * 
			 * System.out.println("Enter the r (radius) of circle"); double rCircle =
			 * sc3.nextDouble();
			 * 
			 * paramList.add(rCircle); CircleSquareImpl circleArea = new CircleSquareImpl();
			 * double resultCircle = circleArea.square(paramList);
			 * 
			 * circleArea.square(paramList); System.out.println("Area of circle = " +
			 * resultCircle); sc3.close();
			 */
		//}

		//else if (figure == 4) {

			/*
			 * Scanner sc4 = new Scanner(System.in);
			 * 
			 * System.out.println("Enter the a side of Right Triangle"); double aRT =
			 * sc4.nextDouble();
			 * 
			 * paramList.add(aRT); RightTriangle rtArea = new RightTriangle(); double
			 * resultRT = rtArea.square(paramList);
			 * 
			 * rtArea.square(paramList); System.out.println("Area of circle = " + resultRT);
			 * sc4.close();
			 */
		//}

		//else if (figure == 5) {

			/*
			 * Scanner sc5 = new Scanner(System.in);
			 * 
			 * System.out.println("Enter the a side of Rectangular"); double aRect =
			 * sc5.nextDouble(); paramList.add(aRect);
			 * 
			 * System.out.println("Enter the b side of Rectangular"); double bRect =
			 * sc5.nextDouble(); paramList.add(bRect);
			 * 
			 * Rectangular rectangularArea = new Rectangular(); double resultRectangular =
			 * rectangularArea.square(paramList);
			 * 
			 * rectangularArea.square(paramList); System.out.println("Area of circle = " +
			 * resultRectangular); sc5.close();
			 */
		//}

		sc.close();
	}

}