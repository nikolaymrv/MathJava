package math;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Square extends Rectangular{

	@Override
	public double square(List<Double> params) throws IOException {
		double result = Math.pow(params.get(0),2); 
		return result;
	}
	
	@Override
	public double getPerimeter(List<Double> params) {
		double perimSquare = (params.get(0)*4); 
		return perimSquare;
	}
	
	@Override
	public void process() throws IOException {
		Scanner sc2 = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
		try {
		
		
		List<Double> paramList = new ArrayList<>();
		System.out.println("Enter the a side of square");    
    		
		String input = sc2.next();
		double aSquare = Double.parseDouble(input);
		flag = false;
        
        paramList.add(aSquare);
        	
        	double resultSquare = this.square(paramList);
        	double perimSquare = this.getPerimeter(paramList);
        	
        	System.out.println("Area of square = " + resultSquare);
        	System.out.println("Perim of square = " + perimSquare);
        	break;
		}
        	catch(NumberFormatException e) {
			System.out.println("Catch Exception:" + e.getMessage() + " " + e.toString());
			System.out.println("Please, enter again (incorrect data entered)");
		
		}
        	
        	
        	
        
	}
		sc2.close();  
	}
	

}
