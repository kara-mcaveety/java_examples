package com.company;

import java.util.Scanner;

public class Main {
    static int arr[];
    static boolean isVisited[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int n = scanner.nextInt();
            arr = new int[n];
            isVisited = new boolean[n];
            int m = scanner.nextInt();
            for (int k = 0; k < n; k++) {
                arr[k] = scanner.nextInt();
            }
            if (canReach(0, arr.length, m))
                System.out.println("Yes");
            else
                System.out.println("No");
            }
        }

        public static boolean canReach(int src, int dest, int m) {
            if (src >= (dest - 1) || (src + m) >= dest)
                return true;
            if (isVisited[src] == true)
                return false;
            isVisited[src] = true;
            if (isValidDest(src + 1) && canReach(src + 1, dest, m))
                return true;
            if (isValidDest(src - 1) && canReach(src - 1, dest, m))
                return true;
            if (isValidDest(src + m) && canReach(src + m, dest, m))
                return true;
            isVisited[src] = false;
            return false;

        }

        private static boolean isValidDest ( int dest){
            if (((dest > 0 && dest < arr.length) && (arr[dest] == 0)))
                return true;
            return false;
        }
    }

