package com.add;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMathAdd {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	@Test
	public void testAddNumberPositive() {
		System.out.println("Number Addition Unit Test");
		MathAdd ma=new MathAdd();
		int  num1=10,num2=7;
		int actualResult=ma.addNum(num1,num2);
		int expectedResult=17;
		assertEquals(expectedResult, actualResult);
	}
	@Test
	public void testAddNumberNegative() {
		System.out.println("Number Addition Unit Test");
		MathAdd ma=new MathAdd();
		int  num1=10,num2=7;
		int actualResult=ma.addNum(num1,num2);
		int expectedResult=15;
		assertEquals(expectedResult, actualResult);
	}
	@Test(timeout=5)//x ms if it generates, test pass
	public void testGenerateRandomNumber()
	{
		double randomNumbers[]=new double[100000];
		for(int i=0;i<100000;i++)
			{randomNumbers[i]=Math.random()+1;}
	}
}
