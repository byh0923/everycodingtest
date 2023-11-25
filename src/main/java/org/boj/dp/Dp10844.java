package org.boj.dp;

import java.util.Scanner;

public class Dp10844 {
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        long m = 1000000000L;

        long[][] arr = new long[N+1][11];


        for(int i=1; i<=9; i++) {
            arr[1][i] = 1;
        }

        for(int i=2; i<N; i++) {
            arr[i][0] = arr[i - 1][1];
            for(int j=1; j<=9; j++) {
                arr[i][j] = (arr[i-1][j-1] + arr[i-1][j+1]) % m;
            }
        }
        long sum = 0;
        for(int i=0; i<10; i++) {
            sum += arr[N][i];
        }
        System.out.println(sum % m);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		 long[][] dp = new long[n+1][11];

         for (int i = 1; i <= 9; i++) {
                dp[1][i] = 1;
         }

         for (int i = 2; i <= n; i++) {
             dp[i][0] = dp[i - 1][1];
             for (int j = 1; j <= 9; j++) {
                 dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000 ;
             }
         }

         long sum = 0;
         for (int i = 0; i < 10; i++) {
             sum += dp[n][i];
         }
         System.out.println(sum % 1000000000);

    }
}
