package org.example;

import java.util.*;

public class Programmer1 {
    public int[] solution(int[] arr) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            if(i==0) {
                list.add(arr[i]);
            } else {
                if(list.get(list.size()-1) != arr[i]) {
                    list.add(arr[i]);
                }
            }


        }


        answer = new int[list.size()];

        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }


        return answer;
    }

    public static void main(String[] args) {
        Programmer1 ps = new Programmer1();
        int[] arr = {1,1,3,3,0,1,1};
        int[] arr2 = {4,4,4,3,3};


        Arrays.stream(ps.solution(arr)).forEach(i -> System.out.println(i));
        System.out.println("---");
        Arrays.stream(ps.solution(arr2)).forEach(i -> System.out.println(i));



    }
}
