package com.newpc.SimpleCalci;

import static org.junit.Assert.*;

import org.junit.Test;

import com.newpc.SimpleCalci.MySimpleCalci;

public class testMultiplication {

	@Test
	public void test() {
		MySimpleCalci c = new MySimpleCalci();
		int result = c.multiplication(11,13);
		assertEquals(143, result);
	}

}
