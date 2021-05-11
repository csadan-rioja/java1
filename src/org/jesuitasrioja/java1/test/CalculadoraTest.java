package org.jesuitasrioja.java1.test;

import static org.junit.Assert.assertEquals;

import org.jesuitasrioja.java1.Calculadora;
import org.junit.Test;

public class CalculadoraTest {
	
	Calculadora c = new Calculadora();

	@Test
	public void testSuma() {
		assertEquals(2, c.suma(1, 1));
	}

	@Test
	public void testResta() {
		assertEquals(2, c.resta(2, 4));
	}

	@Test
	public void testDivision() {
		assertEquals(2, c.division(4, 2));
	}

}
