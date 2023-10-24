package org.programmers.stackqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 프로그래머스 스택/큐 기능개발
 * level2
 * */
public class StackQueue2 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<progresses.length; i++) {
            // 1. 한개 완성하는데 걸리는 시간
            double finishTime = (100 - progresses[i]) / (double)speeds[i];
            int finishTimeToInt = (int) Math.ceil(finishTime);
            // 2. 함께 배포가능한 기능의 index 찾기
            int j = i+1;
            for(; j<progresses.length; j++) {
                if(progresses[j] + speeds[j] * finishTimeToInt < 100) {
                    break;
                }
            }

            // 3. 이번에 배포할 기능의 개수를 추가
            list.add(j - i);
            i = j - 1;
        }

        return list.stream().mapToInt(i -> i.intValue()).toArray();
    }

    public static void main(String[] args) {
        StackQueue2 sq = new StackQueue2();
        int[] progresses = {93, 30, 55};
        int[] speed = {1, 30, 5};
        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speed2 = {1, 1, 1, 1, 1, 1};
        sq.solution(progresses, speed);

        Arrays.stream(sq.solution(progresses, speed)).forEach(i -> System.out.println(i));

    }
}
