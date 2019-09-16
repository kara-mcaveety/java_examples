package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    private static boolean isAnagram(String a, String b) {
        if ((a == null || b == null) || (a.length() != b.length())) {
            return false;
        }
        final char[] ARRAY_A = a.toUpperCase().toCharArray();
        final Map map = new HashMap<char, int>();
        for (int i = 0; i < ARRAY_A.length; i ++) {
            if (map.containsKey(ARRAY_A[i])) {
                map.put(ARRAY_A[i], (map.get(ARRAY_A[i]) + 1));
            } else {
                map.put(ARRAY_A[i],1);
            }
        }
        final char[] ARRAY_B = b.toUpperCase().toCharArray();
        for (int i = 0; i < ARRAY_A.length; i ++) {
            if (map.containsKey(ARRAY_B[i])) {
                Integer count = map.get(ARRAY_B[i]);
                if (count == 0) {
                    return false;
                } else {
                    count--;
                    map.put(ARRAY_B[i], count);
                }
            } else {
                 return false;
                }
            }
            return true;
    }

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String a = scanner.nextLine();
	String b = scanner.nextLine();
	scanner.close();

	boolean ret = isAnagram(a, b);
	System.out.println((ret) ? "Anagrams" : "Not Anagrams");

    }
}
