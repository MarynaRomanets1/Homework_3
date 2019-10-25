package com.epam.homework3_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter text string --> ");
        String str1 = sc.next();
        System.out.println("Symbols unical --> " + uniChars(str1));
    }
        public static String uniChars(String str1) {
            int index1 = 0;
            String res ="";
            while (index1 < str1.length()) {
                char ch1 = str1.charAt(index1);
                int index2 = 0;
                int flag = 0;
                while (index2 < str1.length()) {
                    char ch2 = str1.charAt(index2);
                    if (ch1 == ch2) {
                        flag++;
                    }
                 index2++;
                 }
                if (flag == 1) {
                    res += ch1;
                }
            index1++;
            }
            return res;
        }
}
