package math;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SquareTest {
	
	private Square square;

	@Test
	public void testSquare() throws IOException {
		square = new Square();
		List<Double> params = new ArrayList<>();
		double aSquare = 5;
		params.add(aSquare);
		assertEquals(20, square.getPerimeter(params), 0);
		
	}

	@Test
	public void testSquareArea() throws IOException {
		square = new Square();
		List<Double> params = new ArrayList<>();
		double aSquare = 5;
		params.add(aSquare);
		assertEquals(25, square.square(params), 0);
	}
}
