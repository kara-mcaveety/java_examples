package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String str = scanner.nextLine();
	scanner.close();
	String rev = new StringBuilder(str).reverse().toString();
	if (str.equals(rev)) {
	    System.out.println("Yes");
        } else {
	    System.out.println("No");
        }
    }
}
