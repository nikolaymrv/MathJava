package math;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import org.junit.BeforeClass;
import org.junit.Test;

public class CircleSquareTest {

	private CircleSquareImpl circle;
	
//	@BeforeClass
//	public static void setUp() throws Exception {
//		circle = new CircleSquareImpl();
//	}
	
	@Test
	public void testPerimeterCircle() throws IOException {
		circle = new CircleSquareImpl();
		List<Double> params = new ArrayList<>();
		double rCircle = 5;
		
		params.add(rCircle);		
		assertEquals(31.4, circle.getPerimeter(params), 0.016);		
	}
	
	@Test
	public void testSquareCircle() throws IOException {
		circle = new CircleSquareImpl();
		List<Double> params = new ArrayList<>();
		double rCircle = 5;
		
		params.add(rCircle);
		assertEquals(78.5, circle.square(params), 0.1);
		
	}

}
