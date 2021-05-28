package math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Square extends Rectangular{

	@Override
	public double square(List<Double> params) {
		double result = Math.pow(params.get(0),2); 
		return result;
	}
	
	@Override
	public double getPerimeter(List<Double> params) {
		double perimSquare = (params.get(0)*4); 
		return perimSquare;
	}
	
	@Override
	public void process() {
		List<Double> paramList = new ArrayList<>();
System.out.println("Enter the a side of square");
    	
    	Scanner sc2 = new Scanner(System.in);
    	
    		
        Double aSquare = sc2.nextDouble();
        
        
        paramList.add(aSquare);
        	
        	double resultSquare = this.square(paramList);
        	double perimSquare = this.getPerimeter(paramList);
        	
        	System.out.println("Area of square = " + resultSquare);
        	System.out.println("Perim of square = " + perimSquare);
        	
       sc2.close();    
	}
	

}
