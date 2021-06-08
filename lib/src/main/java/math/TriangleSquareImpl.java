package math;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TriangleSquareImpl implements Area, Perimeter{

	@Override
	public double square(List<Double> params) throws IOException {
		
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
	public void process() throws IOException {
		Scanner sc1 = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
		try {
		List<Double> paramList = new ArrayList<>();
		

		System.out.println("Enter the a side of triangle");
		String input = sc1.next();
		double aTriangle = Double.parseDouble(input);
		paramList.add(aTriangle);

		System.out.println("Enter the b side of triangle");
		String input2 = sc1.next();
		double bTriangle = Double.parseDouble(input2);
		paramList.add(bTriangle);

		System.out.println("Enter the c side of triangle");
		String input3 = sc1.next();
		double cTriangle = Double.parseDouble(input3);
		flag = false;
		paramList.add(cTriangle);

		double resultTriangle = this.square(paramList);
		double perimeterTriangle = this.getPerimeter(paramList);

		System.out.println("Area of triangle = " + resultTriangle);
		System.out.println("Perimeter of triangle = " + perimeterTriangle);
		break;
		}
		
		catch(NumberFormatException e) {
			System.out.println("Catch Exception:" + e.getMessage() + " " + e.toString());
			System.out.println("Please, enter again (incorrect data entered)");
			
		}
		
		
		
			
	}
		sc1.close();
	}

	 
	}

