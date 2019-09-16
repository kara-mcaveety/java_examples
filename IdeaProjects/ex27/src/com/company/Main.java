package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int[] arr = new int[n];

	for (int i = 0; i < n; i++) {
	    arr[i] = scanner.nextInt();
    }
	scanner.close();
	System.out.println(negativeSubarrays(arr));
    }

    private static int negativeSubarrays(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum < 0) {
                    count ++;
                }
            }
        }
        return count;
    }
}
