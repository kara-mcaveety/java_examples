package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i=1; i<=q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            for (int j=0; j<n; j++)  {
                a += b * (int) Math.pow(2,j);
                System.out.print(a + " ");
            }
            System.out.println();
        }
        scanner.close();

    }
}
