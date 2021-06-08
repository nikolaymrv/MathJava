package math;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RightTriangle extends TriangleSquareImpl {
	
	@Override
	public double square(List<Double> params) throws IOException {
		
		double result = (Math.sqrt(3)/4)*Math.pow(params.get(0),2);
		
		return result;
	} 
	
	@Override
	public double getPerimeter(List<Double> params) {
		
		double rtPerim = (params.get(0)*3);
		
		return rtPerim;
	} 
	
	@Override
	public void process() throws IOException {
		Scanner sc4 = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
		try {
		
		
		List<Double> paramList = new ArrayList<>();
		

		System.out.println("Enter the a side of Right Triangle");
		String input = sc4.next();
		double aRT = Double.parseDouble(input);

		flag = false;
		paramList.add(aRT);
	
		double resultRT = this.square(paramList);
		double rtPerim = this.getPerimeter(paramList);
		
		System.out.println("Area of Right Triangle = " + resultRT);
		System.out.println("Perim of Right Triangle = " + rtPerim);
		break;
		}
		catch(NumberFormatException e) {
			System.out.println("Catch Exception:" + e.getMessage() + " " + e.toString());
			System.out.println("Please, enter again (incorrect data entered)");
			//process();
			
		}
		
		
		
		}
		sc4.close();
	}
}
