package com.oneoonenet;

import java.util.Scanner;

// public class Main {
//    public static void main(String[] args) {
//        int n = 10;
//        int result = 1;
//
//        for (int i = 1; i < n; i++) {
//            result += result * i;
//        }
//        System.out.println(n + "! = " + result);
//    }

public class MyClass {
    public static void main(String[] args) {
        MyClass text = new MyClass();
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter number to find factorial for:");
        int factorialNumber = userInput.nextInt();
        System.out.println("The factorial of " + factorialNumber + " is " + text.factorial(factorialNumber));
    }
    public int factorial(int f) {
        if (f == 1) {
            return f;
        } else {
            f = f * factorial(f-1);
            return f;
        }
    }
}
