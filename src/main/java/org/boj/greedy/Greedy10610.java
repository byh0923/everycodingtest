package org.boj.greedy;

import java.util.*;

public class Greedy10610 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();

        Greedy10610 gr = new Greedy10610();
        System.out.println(gr.solution(N));
    }

    // 10만 자리 수 생각
    public int solution2(String N) {
        int result = 0;

        // 30을 존경해서 30의 배수 중 주어진 수 중 가장 큰 30의 배수를 만들면 된다.
        // 30의 배수를 못만들면 -1 리턴
        String changeString = String.valueOf(N);

        String[] arr = new String[changeString.length()];

        for(int i=0; i<arr.length; i++) {
            arr[i] = String.valueOf(changeString.charAt(i));
        }

        //Arrays.stream(arr).forEach(i -> System.out.println(i));
        Arrays.sort(arr, Collections.reverseOrder());

        /**
         * 30의 배수가 되는 조건 1. 0이 포함되어 있어야 한다. 2. 모든 자리를 더한 수가 3의 배수면 된다.
         * */
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }

        if(sum % 3 == 0 && changeString.contains("0")) {
            String sumString = "";
            for(int i=0; i< arr.length; i++) {
               sumString += arr[i];
               result = Integer.parseInt(sumString);
            }
        } else {
            result = -1;
        }

        return result;
    }

    public int solution(String N) {
        int result = 0;

        // 30을 존경해서 30의 배수 중 주어진 수 중 가장 큰 30의 배수를 만들면 된다.
        // 30의 배수를 못만들면 -1 리턴
        String changeString = String.valueOf(N);

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<changeString.length(); i++) {
            list.add(Integer.parseInt(String.valueOf(changeString.charAt(i))));
        }

        Collections.sort(list);


        /**
         * 30의 배수가 되는 조건 1. 0이 포함되어 있어야 한다. 2. 모든 자리를 더한 수가 3의 배수면 된다.
         * */
        int sum = 0;

        for(int i=0; i<list.size(); i++) {
            sum += list.get(i);
        }

        if(sum % 3 == 0 && changeString.contains("0")) {
            String sumString = "";
            for(int i=0; i< list.size(); i++) {
               sumString += String.valueOf(list.get(i));
               result = Integer.parseInt(sumString);
            }
        } else {
            result = -1;
        }

        return result;
    }
}
