package math;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RightTriangleTest {
	
	private RightTriangle rt;

	@Test
	public void testRT() throws IOException {
		rt = new RightTriangle();
		List<Double> params = new ArrayList<>();
		double aRT = 5;
		
		params.add(aRT);
	
		assertEquals(15, rt.getPerimeter(params), 0);
		assertEquals(10.82, rt.square(params), 0.1);
	}

	@Test
	public void testRTArea() throws IOException {
		rt = new RightTriangle();
		List<Double> params = new ArrayList<>();
		double aRT = 5;
		
		params.add(aRT);
	
		
		assertEquals(10.82, rt.square(params), 0.1);
	}
}
