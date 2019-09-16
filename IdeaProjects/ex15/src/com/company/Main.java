package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String str1 = scanner.nextLine();
	int start = scanner.nextInt();
	int end = scanner.nextInt();
	scanner.close();

	System.out.println(str1.substring(start, (end)));
    }
}
