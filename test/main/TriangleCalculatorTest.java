package main;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TriangleCalculatorTest {

	private TriangleCalculator calculator;
	
	@Before
	public void setUp() {
		this.calculator = new TriangleCalculator();
	}

	@Test(expected=IllegalArgumentException.class)
	public void deveRecusarTrianguloInvalido() {
		int[][] triangle = {{1,5},{10,7},{4,2,5}};
		
		calculator.findMaxTotal(triangle);
	}
	
	@Test
	public void deveRetornarValorEsperadoParaTresNiveis() {
		int[][] triangle = {{3},{7,4},{2,4,6}};
		
		assertEquals(14, calculator.findMaxTotal(triangle));
	}
	
	@Test
	public void deveRetornarValorEsperadoParaQuatroNiveis() {
		int[][] triangle = {{3},{7,4},{2,4,6},{8,5,9,3}};

		assertEquals(23, calculator.findMaxTotal(triangle));
	}

}
