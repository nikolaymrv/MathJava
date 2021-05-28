package math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CircleSquareImpl implements Area, Perimeter{

	double pi = 3.14;
	
	@Override
	public double square(List<Double> params) {
		
		double result = pi* Math.pow(params.get(0), 2);
		
		return result;
	}
	
	@Override
	public double getPerimeter(List<Double> params) {

		double circlePerim = 2*pi*params.get(0);
		
		return circlePerim;
	}

	@Override
	public void process() {
		List<Double> paramList = new ArrayList<>();
		Scanner sc3 = new Scanner(System.in);

		System.out.println("Enter the r (radius) of circle");
		double rCircle = sc3.nextDouble();

		paramList.add(rCircle);
		
		double resultCircle = this.square(paramList);
		double circlePerim = this.getPerimeter(paramList);
		
		System.out.println("Area of circle = " + resultCircle);
		System.out.println("Perimeter of circle = " + circlePerim);
		sc3.close();		
	}

	

	
}
