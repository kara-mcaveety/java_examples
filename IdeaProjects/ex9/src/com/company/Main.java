package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int i = 1;
	    while (scanner.hasNext()) {
	    	String str = scanner.nextLine();
	    	System.out.println(i + " " + str);
	    	i++;

        }
	    scanner.close();
    }
}
