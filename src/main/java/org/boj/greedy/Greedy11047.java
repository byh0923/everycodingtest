package org.boj.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Greedy11047 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        Integer[] coins = new Integer[N];
        for(int i=0; i<N; i++) {
            coins[i] = scan.nextInt();
        }

        Greedy11047 g = new Greedy11047();
        System.out.println(g.solution(N, K, coins));

    }

    public int solution(int N, int K, Integer[] coins) {
        int result = 0;

        // 큰 수 부터 주는게 최소값에 유리하니.. 정렬 내림차순 정렬
        Arrays.sort(coins, Collections.reverseOrder());

        /**
         * 원래 값 / 배열0번부터
         * */
        for(int i=0; i<N; i++) {

            // 몫은 줄 수 있는 동전의 수
            result += K/coins[i];

            // 나머지가 바꾸고 남은 금액
            K%=coins[i];

            // 나눈 수가 0이 되면 그 전에 종료
            if(K == 0) {
                break;
            }
        }

        return result;
    }
}
