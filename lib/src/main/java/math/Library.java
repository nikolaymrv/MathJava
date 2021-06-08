package math;

import java.io.IOException;
import java.util.Scanner;

public class Library {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		Choice choice = new Choice();
		int figure = choice.choice(sc);
				
		switch (figure) {
		case (1):
		
			TriangleSquareImpl triangleArea = new TriangleSquareImpl();
			try {
			
				triangleArea.process();
			
			} catch (IOException e) {
				
				System.out.println("Catch IOException:" + e.getMessage());
			} 
			break;
 
		case (2):
			
			Square squareArea = new Square();
			try {
				squareArea.process();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			break;

		case (3):
			
			CircleSquareImpl circleArea = new CircleSquareImpl();
			try {
				circleArea.process();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			break;

		case (4):
			RightTriangle rtArea = new RightTriangle();
			try {
				rtArea.process();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			break;

		case (5):
			
			Rectangular rectangularArea = new Rectangular();
			try {
				rectangularArea.process();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			break;
			
		default: break;
		}
		sc.close();
		
		} 
			

		
	}

