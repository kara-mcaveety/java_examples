package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int[] a = new int[n];
	for (int i = 0; i < n; i++) {
	    int val = scanner.nextInt();
	    a[i] = val;
    }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
