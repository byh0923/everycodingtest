package org.programmers.stackqueue;

import java.util.Arrays;

/**
 * 주식가격
 * */
public class StackQueue5 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i=0; i<prices.length; i++) {
            int num = 0;
            for(int j=i+1; j<prices.length; j++) {
                num++;
                if(prices[i] > prices[j]) {
                    break;
                }
            }
            answer[i] = num;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        // 4 3 1 1 0
        StackQueue5 st = new StackQueue5();
        Arrays.stream(st.solution(prices)).forEach(x -> System.out.println(x));


    }
}
