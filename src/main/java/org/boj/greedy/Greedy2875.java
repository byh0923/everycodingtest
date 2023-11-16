package org.boj.greedy;

import java.util.Scanner;

public class Greedy2875 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        Greedy2875 gr = new Greedy2875();

        System.out.println(gr.solution(N, M, K));

    }

    public int solution(int N, int M, int K) {
        int result = 0;

        // 여2 남1 1팀
        // N 여학생 M 남학생 K명은 인턴십 참가해야하는 애들



        // 6-2 3-1  1팀
        // 4-2 2-1  1 1팀
        // 2 1  1
        //
        while(N>=2 && M>=1 && N+M-K>= 3) {

            N = N - 2;
            M = M - 1;
            result++;
        }
        return result;
    }
}
