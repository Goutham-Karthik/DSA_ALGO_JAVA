package src.leetcode.easy;

public class IndexFirstOccuranceString28 {

    public static void main(String[] args) {
        String str = "sadbutsad";
        String sub = "sad";

        if(str.indexOf(sub)==0){
            System.out.println(str.indexOf(sub));
        } else {
            System.out.println("");
        }
    }
}
