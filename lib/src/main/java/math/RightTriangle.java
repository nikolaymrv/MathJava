package math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RightTriangle extends TriangleSquareImpl {
	
	@Override
	public double square(List<Double> params) {
		
		double result = (Math.sqrt(3)/4)*Math.pow(params.get(0),2);
		
		return result;
	} 
	
	@Override
	public double getPerimeter(List<Double> params) {
		
		double rtPerim = (params.get(0)*3);
		
		return rtPerim;
	} 
	
	@Override
	public void process() {
		List<Double> paramList = new ArrayList<>();
		Scanner sc4 = new Scanner(System.in);

		System.out.println("Enter the a side of Right Triangle");
		double aRT = sc4.nextDouble();

		paramList.add(aRT);
	
		double resultRT = this.square(paramList);
		double rtPerim = this.getPerimeter(paramList);
		
		System.out.println("Area of Right Triangle = " + resultRT);
		System.out.println("Perim of Right Triangle = " + rtPerim);
		sc4.close();
	}
}
