package com.icode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Calculator!");
        System.out.println("Please use '+' for Addition '-' for Subtraction '*' for Multiplication and '/' for Division. Any other Operator won't be Valid.");
	Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter Your First Number: ");
//        You can use Double if you are building for large calculations.
        float input1 = scan1.nextFloat();
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter Your Operator: ");
//        We are using charAt Method to find 0th index of our string.
        char input2 = scan2.next().charAt(0);
        Scanner scan3 = new Scanner(System.in);
        System.out.print("Enter Your Second Number: ");
        float input3 = scan3.nextFloat();
        if (input2 == '+'){
            System.out.println(input1 + input3);
        }
        else if (input2 == '-'){
            System.out.println(input1 - input3);
        }
        else if (input2 == '*'){
            System.out.println(input1 * input3);
        }
        else if (input2 == '/'){
            System.out.println(input1 / input3);
        }
        else {
            System.out.println("Operator or Number is not Valid.");
        }

    }
}
