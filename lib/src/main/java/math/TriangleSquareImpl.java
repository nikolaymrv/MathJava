package math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TriangleSquareImpl implements Area, Perimeter{

	@Override
	public double square(List<Double> params) {
		
		double p = (params.get(0) + params.get(1) + params.get(2))/2;
		
		double result = Math.sqrt(p*(p-params.get(0))*(p-params.get(1))*(p-params.get(2)));
		
		return result;
	}
	
	@Override
	public double getPerimeter(List<Double> params) {
		
		double perimeterTriangle = params.get(0) + params.get(1) + params.get(2);
		
		return perimeterTriangle;
	} 


	@Override
	public void process() {
		List<Double> paramList = new ArrayList<>();
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

		double resultTriangle = this.square(paramList);
		double perimeterTriangle = this.getPerimeter(paramList);

		System.out.println("Area of triangle = " + resultTriangle);
		System.out.println("Perimeter of triangle = " + perimeterTriangle);
		sc1.close();
		
	}

	 
	}

