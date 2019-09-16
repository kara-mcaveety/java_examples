package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String str1 = scanner.nextLine();
	String str2 = scanner.nextLine();
	scanner.close();

	int sum = str1.length() + str2.length();
	System.out.println(sum);
	if (str1.compareTo(str2) > 0) {
		System.out.println("Yes");
	} else {
		System.out.println("No");
	}
	System.out.println(capFirstLetter(str1) + " " + capFirstLetter(str2));

    }

    private static String capFirstLetter(String str) {
    	if (str == null || str.length() == 0) {
    		return "";
		} else {
    		return str.substring(0,1).toUpperCase() + str.substring(1);
		}
	}
}
