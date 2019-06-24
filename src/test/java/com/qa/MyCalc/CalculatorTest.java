package com.qa.MyCalc;


import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {

	@Test
	public void AddTwoNumbersTogetherTest() {
		Calculator calculator = new Calculator();
		int result = calculator.add(2,2);
		Assert.assertEquals(4, result);
	}
	@Test
	public void SubtractTwoNumbersTest() {
		Calculator calculator = new Calculator();
		int result = calculator.subtract(4,2);
		Assert.assertEquals(2, result);
	}
	@Test
	public void MultipltyTwoNumbersTest() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(4,2);
		Assert.assertEquals(8, result);
	}
}
