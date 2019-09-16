package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int T = scan.nextInt();
    String [] str1 = new String[T];
    String [] str2 = new String[T];

	for (int i = 0; i < T; i++) {
	    str1[i] = scan.next();
	    str2[i] = scan.next();
    }
	scan.close();

	HashSet<String> set = new HashSet<>(T);
	for (int i =0; i < T; i++) {
	    set.add(str1[i] + " " + str2[i]);
	    System.out.println(set.size());
    }


    }
}
