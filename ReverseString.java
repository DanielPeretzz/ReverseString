package com.company.danielproject;

import java.util.Scanner;

public class ReverseString {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter a String : ");
        String inputString = SCANNER.nextLine();
        String newString = "";
        for (int i = 0; i < inputString.length(); i++) {
            newString += inputString.charAt(i);
        }
        char[] charString = new char[newString.length()];
        for (int i = (charString.length - 1); i >= 0; i--) {
            charString[i] = newString.charAt(i);
            System.out.print(charString[i]);
        }


    }
}

