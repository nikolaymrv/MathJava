package MathJava;

import java.util.List;

public class Square extends Rectangular{

	@Override
	public double square(List<Double> params) {
		double result = Math.pow(params.get(0),2); 
		return result;
	}

}
