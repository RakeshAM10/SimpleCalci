package com.newpc.SimpleCalci;

import com.newpc.SimpleCalci.MySimpleCalci;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        MySimpleCalci c = new MySimpleCalci();
        int a, b;

        if (args.length >= 2) {
            try {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format in arguments. Falling back to interactive input.");
                a = b = 0;
                getInputInteractively(c);
                return;
            }
        } else {
            // No command line arguments, use interactive input
            getInputInteractively(c);
            return;
        }

        printOperations(c, a, b);
    }

    private static void getInputInteractively(MySimpleCalci c) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for first operand");
        int a = sc.nextInt();
        System.out.println("Enter the value for second operand");
        int b = sc.nextInt();
        sc.close();
        printOperations(c, a, b);
    }

    private static void printOperations(MySimpleCalci c, int a, int b) {
        System.out.println(a + " + " + b  + " = " + c.addition(a, b));    
        System.out.println(a + " - " + b  + " = " + c.subtraction(a, b));    
        System.out.println(a + " * " + b  + " = " + c.multiplication(a, b));    
        System.out.println(a + " / " + b  + " = " + c.division(a, b));    
        System.out.println(a + " % " + b  + " = " + c.remainder(a, b));    
    }
}
