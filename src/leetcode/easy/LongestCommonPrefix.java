package src.leetcode.easy;

import java.util.Arrays;

public class LongestCommonPrefix {

public static void main(String[] args) {
  //  String[] strs = {"atc","atb","atr"};
    String[] strs = {"flower","flow","flight"};
   // String[] strs = {"ower","flw","ight"};

//    if (strs == null || strs.length == 0) {
//        System.out.println("Longest Common Prefix: ");
//        return;
//    }

//    for (int i = 0; i < strs[0].length(); i++) {
//        char c = strs[0].charAt(i);
//        for (int j = 1; j < strs.length; j++) {
//            if (strs[j].charAt(i) != c) {
//                System.out.println("Longest Common Prefix1: " + strs[0].substring(0, i));
//                return;
//            }
//        }
//    }

//java 7 ----- different way

//    if (strs == null || strs.length == 0)
//        System.out.println("");;
//    String prefix = strs[0];
//    for (String s : strs)
//        while (s.indexOf(prefix) != 0)
//            prefix = prefix.substring(0, prefix.length() - 1);
//    System.out.println(prefix);


    // java ----------8
    if (strs == null || strs.length == 0) {
        System.out.println("");
        return;
    }

    // Find the longest common prefix using Java 8 streams
    String prefix = Arrays.stream(strs)
            .reduce((s1, s2) -> {
                // Keep removing characters from the end of prefix until it's a prefix of the current string
                while (!s2.startsWith(s1)) {
                    s1 = s1.substring(0, s1.length() - 1);
                }
                return s1;
            })
            .orElse("");

    System.out.println(prefix);
}
}
