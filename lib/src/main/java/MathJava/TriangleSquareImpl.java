package MathJava;

import java.util.List;

public class TriangleSquareImpl implements Area{

	@Override
	public double square(List<Double> params) {
		
		double p = (params.get(0) + params.get(1) + params.get(2))/2;
		
		double result = Math.sqrt(p*(p-params.get(0))*(p-params.get(1))*(p-params.get(2)));
		
		return result;
	} 
}
