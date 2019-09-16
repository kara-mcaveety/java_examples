package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	try {
	    int x = scan.nextInt();
	    int y = scan.nextInt();
	    try {
	        int result = x/y;
	        System.out.println(result);
        } catch (Exception e){
	        System.out.println("java.lang.ArithmeticException: / by zero");
        }
    } catch (Exception e) {
	    System.out.println("java.util.InputMismatchException");
    }
    }
}
