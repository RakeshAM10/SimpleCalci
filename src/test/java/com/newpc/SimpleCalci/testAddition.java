package com.newpc.SimpleCalci;

import static org.junit.Assert.*;

import org.junit.Test;

import com.newpc.SimpleCalci.MySimpleCalci;

public class testAddition {

	@Test
	public void test() {
		MySimpleCalci c = new MySimpleCalci();
		int result = c.addition(11,13);
		assertEquals(24, result);
	}

}
