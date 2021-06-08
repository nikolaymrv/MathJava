package math;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rectangular implements Area, Perimeter{

	@Override
	public double square(List<Double> params) throws IOException {
		double result = (params.get(0)*params.get(1)); 
		return result;
	}

	@Override
	public double getPerimeter(List<Double> params) {
		
		double rectPerim = ((params.get(0)+params.get(1))*2);
		
		return rectPerim;
	}
	
	@Override
	public void process() throws IOException {
		
		List<Double> paramList = new ArrayList<>();
		Scanner sc5 = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
		try {			
		System.out.println("Enter the a and b side of Rectangular");	

		
		String input = sc5.next();
		double aRect = Double.parseDouble(input);
		paramList.add(aRect);
		
		String input2 = sc5.next();
		double bRect = Double.parseDouble(input2);
		flag = false;
		paramList.add(bRect);
		
			
		double resultRectangular = this.square(paramList);
		double rectPerim = this.getPerimeter(paramList);
		
		System.out.println("Area of Rectangular = " + resultRectangular);
		System.out.println("Perim of Rectangular = " + rectPerim);
		break;
		}
		
		catch (NumberFormatException e) { 
			
			System.out.println("Catch Exception:" + e.getMessage() + " " + e.toString());
			System.out.println("Please, enter again (incorrect data entered)");
			
			
		}
		
			
		
		}
			sc5.close();
	}

	
}