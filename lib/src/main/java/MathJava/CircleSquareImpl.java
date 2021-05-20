package MathJava;

import java.util.List;

public class CircleSquareImpl implements Area{

	@Override
	public double square(List<Double> params) {
		
		double pi = 3.14;
		
		double result = pi* Math.pow(params.get(0), 2);
		
		return result;
	}

	
}
