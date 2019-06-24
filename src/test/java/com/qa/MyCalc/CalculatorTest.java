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

}
