package com.newpc.SimpleCalci;

import com.newpc.SimpleCalci.MySimpleCalci;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
		MySimpleCalci c = new MySimpleCalci();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for first operand");
		int a = sc.nextInt();
		System.out.println("Enter the value for second operand");
		int b = sc.nextInt();
		System.out.println(a + " + " + b  + " = " + c.addition(a, b));	
		System.out.println(a + " - " + b  + " = " + c.subtraction(a, b));	
		System.out.println(a + " * " + b  + " = " + c.multiplication(a, b));	
		System.out.println(a + " / " + b  + " = " + c.division(a, b));	
		System.out.println(a + " % " + b  + " = " + c.remainder(a, b));	

    }
}
