package org.boj.greedy;

import java.util.*;

public class Greedy10610 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();

        Greedy10610 gr = new Greedy10610();
        System.out.println(gr.solution(N));
    }


    public String solution(String N) {
        int result = 0;

        // 30을 존경해서 30의 배수 중 주어진 수 중 가장 큰 30의 배수를 만들면 된다.
        // 30의 배수를 못만들면 -1 리턴

        List<String> list = new ArrayList<>();
        for(int i=0; i<N.length(); i++) {
            list.add(String.valueOf(N.charAt(i)));
        }

        Collections.sort(list, Collections.reverseOrder());

        //list.stream().forEach(i -> System.out.println(i));


        /**
         * 30의 배수가 되는 조건 1. 0이 포함되어 있어야 한다. 2. 모든 자리를 더한 수가 3의 배수면 된다.
         * */
        int sum = 0;

        for(int i=0; i<list.size(); i++) {
            sum += Integer.parseInt(list.get(i));
        }

        if(sum % 3 == 0 && N.contains("0")) {
            String sumString = "";
            for(int i=0; i< list.size(); i++) {
               sumString += String.valueOf(list.get(i));
               result = Integer.parseInt(sumString);
            }
        } else {
            result = -1;
        }

        return String.valueOf(result);
    }
}
