package math;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TriangleTest {

	private TriangleSquareImpl triangle;
	
	@Test
	public void testTriangle() throws IOException {
		triangle = new TriangleSquareImpl();
		List<Double> params = new ArrayList<>();
		double aTr = 4;
		params.add(aTr);
		double bTr = 5;
		params.add(bTr);
		double cTr = 6;
		params.add(cTr);
		assertEquals(15, triangle.getPerimeter(params), 0);
		assertEquals(9.92, triangle.square(params), 0.1);
	}

	@Test
	public void testTriangleArea() throws IOException {
		triangle = new TriangleSquareImpl();
		List<Double> params = new ArrayList<>();
		double aTr = 4;
		params.add(aTr);
		double bTr = 5;
		params.add(bTr);
		double cTr = 6;
		params.add(cTr);
		assertEquals(9.92, triangle.square(params), 0.1);
	}
}
