package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String s = scanner.nextLine();
	int k = scanner.nextInt();
	scanner.close();

	String smallest = s.substring(0,k);
	String largest = s.substring(0,k);

	for (int i = 0; i < s.length() - k; i++) {
	    String tmp = s.substring(i, i+k);
	    if (smallest.compareTo(tmp) > 0) {
	        smallest = tmp;
        }
	    if (largest.compareTo(tmp) < 0) {
	        largest = tmp;
        }
    }
	System.out.println(smallest);
	System.out.println(largest);
    }
}
