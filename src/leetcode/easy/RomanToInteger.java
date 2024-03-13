package src.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

        Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000*/
public class RomanToInteger {

    //Java 7
    public static void main(String[] args) {
        String s = "CCXCVIII";
        int res =0;
//        Map<Character, Integer> map = new HashMap<>();
//        map.put('I',1);
//        map.put('V',5);
//        map.put('X',10);
//        map.put('L',50);
//        map.put('C',100);
//        map.put('D',500);
//        map.put('M',1000);
//
//        for(int i=0; i<s.length(); i++){
//            if(i>0 && map.get(s.charAt(i)) > map.get(s.charAt(i-1))){
//                res += map.get(s.charAt(i)) -  2*map.get(s.charAt(i-1));
//            } else{
//                res += map.get(s.charAt(i));
//            }
//        }
//        System.out.println(res);

        // another best approach
        int answer = 0, num = 0, prev = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
//            if (4*num < ans) ans -= num;
//            else ans += num;
//        }

            if (num < prev) {
                answer -= num;
            }
            else {
                answer += num;
            }
            prev = num;
        }
        //return answer;
        System.out.println(answer);
    }



}
