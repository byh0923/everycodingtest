package org.boj.dp;

import java.util.Scanner;

public class Dp11726 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[] dp = new int[N+1];

        dp[0] = dp[1] = 1;

        for(int i=2; i<=N; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }
        System.out.println(dp[N]);

    }
}
