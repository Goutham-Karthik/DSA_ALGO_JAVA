package src.leetcode.easy;

public class LengthOfLastWord58 {

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int len = s.length()-1;
        while(len>=0 && s.charAt(len)==' '){
            len--;
        }
        int c =0;
        for(int i=len; i>0; i--){
            if(s.charAt(i) == ' '){
                break;
            } else{
                c++;
            }
        }
        System.out.println(c);
    }
}
