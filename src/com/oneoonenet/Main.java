package com.oneoonenet;

/*
Does not (need to) use recursion. I leave it up to the reader to decide which solution is best.
 */
public class Main {
    public static void main(String[] args) {
        int n = 10;
        int result = 1;

        for (int i = 1; i < n; i++) {
            result += result * i;
        }
        System.out.println(n + "! = " + result);
    }
}