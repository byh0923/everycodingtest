package org.boj.dp;

import java.util.Scanner;

public class Dp9095 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[] arr = new int[N];

        for(int i=0; i<arr.length; i++) {
            arr[i] = scan.nextInt();
        }


        int[] dp = new int[11];

        for(int i=0; i<dp.length; i++) {
            if(i==1) {
                dp[i] = 1;
            } else if(i == 2) {
                dp[i] = 2;
            } else if(i == 3) {
                dp[i] = 4;
            } else if(i==0) {
                dp[0] = 0;
            } else if(i>=4){
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
        }
        for(int i=0; i<N; i++) {
            System.out.println(dp[arr[i]]);
        }
    }
}
