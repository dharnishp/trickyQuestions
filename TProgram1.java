/*
Write A Java Program Add two numbers without using ‘+’ operator
*/

package com.dharnish.tricky;
import java.util.Scanner;
class TProgram1
{
    public static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);  
      int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        System.out.println("Sum: " + add(num1, num2));
    }
}

