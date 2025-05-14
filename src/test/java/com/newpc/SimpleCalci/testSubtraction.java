package com.newpc.SimpleCalci;

import static org.junit.Assert.*;

import org.junit.Test;

import com.newpc.SimpleCalci.MySimpleCalci;

public class testSubtraction {

	@Test
	public void test() {
		MySimpleCalci c = new MySimpleCalci();
		int result = c.subtraction(11,13);
		assertEquals(-2, result);
	}

}
