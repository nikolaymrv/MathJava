package MathJava;

import java.util.List;

public class Rectangular implements Area{

	@Override
	public double square(List<Double> params) {
		double result = (params.get(0)*params.get(1)); 
		return result;
	}
}