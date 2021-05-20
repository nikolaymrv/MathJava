package MathJava;

import java.util.List;

public class Square implements Area{

	@Override
	public double square(List<Double> params) {
		double result = Math.pow(params.get(0),2); 
		return result;
	}

}
