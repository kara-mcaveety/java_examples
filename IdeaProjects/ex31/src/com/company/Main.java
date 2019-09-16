package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    Map<String, String> phoneBook = new HashMap<>();
	    int n = scan.nextInt();
	    scan.nextLine();
	    for (int i = 0; i < n; i++) {
	        String name = scan.nextLine();
	        String phone = scan.nextLine();
	        phoneBook.put(name, phone);

        }
	    while(scan.hasNextLine()) {
	        String name = scan.nextLine();
	        if (phoneBook.containsKey(name)) {
	            System.out.println(name + "=" + phoneBook.get(name));
            } else {
	            System.out.println("Not found");
            }
        }
        scan.close();
    }
}
