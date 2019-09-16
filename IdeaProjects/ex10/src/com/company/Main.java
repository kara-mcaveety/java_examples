package com.company;

import java.util.Scanner;

public class Main {
    private static int B;
    private static int H;
    private static Boolean valid;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        scanner.close();
        if (B < 0 || H < 0) {
            valid = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            valid = true;
        }
    }


    public static void main(String[] args) {
	    if (valid) {
	        int area = B * H;
	        System.out.println(area);
        }
    }
}
