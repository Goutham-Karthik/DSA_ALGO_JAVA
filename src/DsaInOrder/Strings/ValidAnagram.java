package src.DsaInOrder.Strings;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean res = true;
//        Map<Character, Integer > smap = new HashMap<>();
//        Map<Character, Integer > tmap = new HashMap<>();
//        for ( char s1: s.toCharArray()){
//            smap.put(s1, smap.getOrDefault(s1, 0) +1);
//        }
//        for(char t1: t.toCharArray()){
//            tmap.put(t1, tmap.getOrDefault(t1, 0) +1);
//        }
//
//        if(smap.equals(tmap)){
//            System.out.println(true);
//        } else{
//            System.out.println(false);
//        }
        /// the below is the efficient one where we use only one array to count the frequency of characters
        //and subtract that for the second string -- so that all counts should be zero if they are anagrams
        if(s.length() != t.length()){
            System.out.println(false);
            return;
        }

        int[] count = new int[26];
        for(int i =0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int c: count) {
            if (c != 0) {
                res = false;
                break;
            }
        }
        System.out.println(res);
    }
}
