package org.programmers.stackqueue;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 프로그래머스 level2 프로세스
 * */
public class StackQueue3 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        // 내림차순 선언
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : priorities) {
            queue.add(num);
        }

        // 3, 2 ,2, 1
        // 2, 1, 3, 2
        while(!queue.isEmpty()) {
            for(int i=0; i<priorities.length; i++) {
                // 현재 작업의 위치 찾기
                if(queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;

                    if(location == i) {
                        return answer;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        StackQueue3 st = new StackQueue3();
        int[] priorities = {2, 1, 3, 2};
        int location = 2;

        int[] priorities2 = {1, 1, 9, 1, 1, 1};
        int location2 = 0;
        System.out.println(st.solution(priorities, location));

    }
}
