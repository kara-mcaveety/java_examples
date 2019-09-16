package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	List<Integer> list = new ArrayList<>();
	for (int i = 0; i < N; i++) {
	    int element = scan.nextInt();
	    list.add(element);
    }

	int Q = scan.nextInt();
	for (int i = 0; i < Q; i++) {
	    String str = scan.next();
	    if (str.equals("Insert")) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            list.add(x, y);
        } else {
	        int x = scan.nextInt();
	        list.remove(x);
        }
    }
	scan.close();
	 for (Integer num : list) {
	 	System.out.print(num + " ");
	 }

    }
}
