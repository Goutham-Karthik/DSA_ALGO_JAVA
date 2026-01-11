package src.DsaInOrder.Strings;

import java.util.Arrays;

public class IsSubSequence {

    public static void main(String[] args) {
        String s = "ahbgdc";
        String t = "abc";
        // index has to be -1 because we should search from index 0 ... not from 1 because we are incrementing 1 in the indexof method
        int index =-1;
//        int i = 0;
//        for (int j = 0; j < s.length() && i < t.length(); j++) {
//            if (s.charAt(j) == t.charAt(i)) {
//                i++;
//            }
//        }
//        System.out.println(i == t.length());
        for(char ch : t.toCharArray()){
            // we are using index +_1 because if letter are repeated )eg "aaaaa" in string of "bbaaaaa" in the substring then it ll return the same index everytime it searches the character..
            // so we should move to the next index to find if the next character exists after that index
           index = s.indexOf(ch, index+1);
            if(index == -1){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
