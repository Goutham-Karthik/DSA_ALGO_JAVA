package src.DsaInOrder.Strings;

public class LongestCommonPrefix {
    // logic take every character of the first string and compare it with the same index i character of other strings.
    //exit the loop when a mismatch is found and return the substring from 0 to that index i
    // and also chek if the index of the first string exceeds the length of any other string to avoid index out of bound exception
    // and stop the loop if the index i has reached the length of the next string( i == strs[j].length())
    public static void main(String[] args) {
        String[] strs = {"flower","flow","floight"};
        for(int i =0; i< strs[0].length(); i++){
            char s1 = strs[0].charAt(i);
            for(int j =1; j< strs.length; j++){
                if(i == strs[j].length() || strs[j].charAt(i) != s1){
                    System.out.println(strs[0].substring(0,i));
                    return;
                }
            }
        }
    }
}
