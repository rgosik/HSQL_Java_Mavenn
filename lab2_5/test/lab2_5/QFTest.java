package lab2_5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class QFTest {
	
	public static QuadraticFunction func;
	
	@Test
	
	public void quadracticFunctionWithWholeNumbersTest()
	
	{
		func = QuadraticFunction.of(1, -4, 3);
		assertEquals(1, func.x1.getRe(), 0.01);
		assertEquals(3, func.x2.getRe(), 0.01);
	}
	
	@Test
	
	public void quadraticFunctionWithRealNumbers()
	
	{
		func = QuadraticFunction.of(0.5, -1.3, -0.6);
		assertEquals(-0.4, func.x1.getRe(), 0.01);
		assertEquals(3, func.x2.getRe(), 0.01);
	}
	
	@Test
	
	public void quadraticFunctionWithZeroDeltaTest()
	
	{
		func = QuadraticFunction.of(1, -6, 9);
		assertEquals(3, func.x1.getRe(), 0.01);
		assertEquals(3, func.x2.getRe(), 0.01);
	}
	
	@Test(expected = IllegalArgumentException.class)
	
	public void quadraticFunctionWithNoXTest()
	
	{
		func = QuadraticFunction.of(0, 0, 3);
		assertEquals(0, func.getA(), 0.01);
	}
	
	@Test
	public void quadracticFunctionLinearTest() {
		func = QuadraticFunction.of(0, 2, 4);
		assertEquals(-2, func.x1.getRe(), 0.01);
		assertEquals(-2, func.x2.getRe(), 0.01);
	}
	
	@Test
	public void complexTest1() {
		func = QuadraticFunction.of(1, 2, 5);
		assertEquals(-1, func.x1.getRe(), 0.01);
		assertEquals(-2, func.x1.getIm(), 0.01);
		assertEquals(-1, func.x2.getRe(), 0.01);
		assertEquals(2, func.x2.getIm(), 0.01);
	}
	
	@Test
	public void complexTestBEqualsZero() {
		func = QuadraticFunction.of(1, 0, 5);
		assertEquals(0, func.x1.getRe(), 0.01);
		assertEquals(-Math.sqrt(5), func.x1.getIm(), 0.01);
		assertEquals(0, func.x2.getRe(), 0.01);
		assertEquals(Math.sqrt(5), func.x2.getIm(), 0.01);
	}
	
	@Test
	public void complexTestCEqualsZero() {
		func = QuadraticFunction.of(16, 32, 0);
		assertEquals(-2, func.x1.getRe(), 0.01);
		assertEquals(0, func.x2.getRe(), 0.01);
	}
}
