package math;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CircleSquareImpl implements Area, Perimeter{

	
	
	@Override
	public double square(List<Double> params) throws IOException {
		
		double result = Math.PI* Math.pow(params.get(0), 2);
		
		return result;
	}
	
	@Override
	public double getPerimeter(List<Double> params) {

		double circlePerim = 2*Math.PI*params.get(0);
		
		return circlePerim;
	}

	@Override
	public void process() throws IOException {
		Scanner sc3 = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
		try {
		List<Double> paramList = new ArrayList<>();
		
		
		System.out.println("Enter the r (radius) of circle");
		
		String input = sc3.next();
		double rCircle = Double.parseDouble(input);
		flag = false;
		paramList.add(rCircle);
		
		double resultCircle = this.square(paramList);
		double circlePerim = this.getPerimeter(paramList);
		
		System.out.println("Area of circle = " + resultCircle);
		System.out.println("Perimeter of circle = " + circlePerim);
		break;
		}
		catch(NumberFormatException e)
		{
			System.out.println("Catch Exception:" + e.getMessage() + " " + e.toString());
			System.out.println("Please, enter again (incorrect data entered)");
			//process();
		}
		
		
				
		
		}
		sc3.close();
	}

	

	
}
