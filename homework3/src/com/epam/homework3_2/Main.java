package com.epam.homework3_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter positive number -->  ");
        int number = sc.nextInt();
        if (number >= 0) {
            String numberString = change(number);
            System.out.println(" 10 number system: " + number + "; 2 number system: " + numberString);
        }
        else {
            System.out.println("Negative number is not valued");
        }
    }

    public static String change(int number1) {
        String numberToString = "";
        int ost = 0;
        while (number1> 1) {
            ost = number1 % 2;
            number1 = number1 / 2;
            numberToString = numberToString + Integer.toString(ost);
        }
        numberToString = numberToString + number1;
        StringBuffer strBuffer = new StringBuffer(numberToString);
        strBuffer.reverse();
        numberToString = strBuffer.toString();
        return numberToString;
    }
}
