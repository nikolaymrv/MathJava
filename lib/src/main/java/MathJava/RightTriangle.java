package MathJava;

import java.util.List;

public class RightTriangle extends TriangleSquareImpl {
	
	@Override
	public double square(List<Double> params) {
		
		double result = (Math.sqrt(3)/4)*Math.pow(params.get(0),2);
		
		return result;
	} 
}
