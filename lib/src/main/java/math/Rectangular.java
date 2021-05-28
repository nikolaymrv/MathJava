package math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rectangular implements Area, Perimeter{

	@Override
	public double square(List<Double> params) {
		double result = (params.get(0)*params.get(1)); 
		return result;
	}

	@Override
	public double getPerimeter(List<Double> params) {
		
		double rectPerim = ((params.get(0)+params.get(1))*2);
		
		return rectPerim;
	}
	
	@Override
	public void process() {
		List<Double> paramList = new ArrayList<>();
		Scanner sc5 = new Scanner(System.in);

		System.out.println("Enter the a side of Rectangular");
		double aRect = sc5.nextDouble();
		paramList.add(aRect);

		System.out.println("Enter the b side of Rectangular");
		double bRect = sc5.nextDouble();
		paramList.add(bRect);

		
		double resultRectangular = this.square(paramList);
		double rectPerim = this.getPerimeter(paramList);
		
		System.out.println("Area of Rectangular = " + resultRectangular);
		System.out.println("Perim of Rectangular = " + rectPerim);
		sc5.close();
		
	}

	
}