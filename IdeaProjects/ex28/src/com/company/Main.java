package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
	for (int row = 0; row < n; row++) {
	    int d = scanner.nextInt();
	    ArrayList<Integer> list = new ArrayList<>();
	    for (int col = 0; col < d; col++) {
	        list.add(scanner.nextInt());
        }
	    lists.add(list);
    }

	int q = scanner.nextInt();
	for (int i = 0; i < q; i++) {
	    int x = scanner.nextInt();
	    int y = scanner.nextInt();
	    ArrayList<Integer> list = lists.get(x-1);
	    if (y <= list.size()) {
	        System.out.println(list.get(y-1));
        } else {
	        System.out.println("Error!");
        }
    }
	scanner.close();


    }
}
