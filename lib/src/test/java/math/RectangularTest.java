package math;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RectangularTest {
	
	private Rectangular objectUnderTest;

	@Test
	public void testRect() throws IOException {
		objectUnderTest = new Rectangular();
		List<Double> params = new ArrayList<>();
		double aRect = 5;
		double bRect = 6;
		params.add(aRect);
		params.add(bRect);
		assertEquals(22, objectUnderTest.getPerimeter(params), 0);
		assertEquals(30, objectUnderTest.square(params), 0);
	}

	@Test
	public void testRectArea() throws IOException {
		objectUnderTest = new Rectangular();
		List<Double> params = new ArrayList<>();
		double aRect = 5;
		double bRect = 6;
		params.add(aRect);
		params.add(bRect);
		
		assertEquals(30, objectUnderTest.square(params), 0);
	}
}
