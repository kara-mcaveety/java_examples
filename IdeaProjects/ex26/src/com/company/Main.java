package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[][] = new int[6][6];

        for (int arr_i = 0; arr_i < 6; arr_i++) {
            for (int arr_j = 0; arr_j < 6; arr_j++) {
                arr[arr_i][arr_j] = scanner.nextInt();
            }
        }

        int sum[] = new int[16];
        int h = 0;
        for (int i = 0; i < 4; i++) {
            for (int x = 0; x < 4; x++) {
                sum[h] = arr[i][x] + arr[i][x + 1] + arr[i][x + 2]
                        + arr[i + 2][x] + arr[i + 2][x + 1] + arr[i + 2][x + 2]
                        + arr[i + 1][x + 1];
                h++;

            }
        }
        Arrays.sort(sum);
        System.out.println(sum[15]);
    }
}

