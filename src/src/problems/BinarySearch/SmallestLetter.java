package problems.BinarySearch;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

/*Input: letters = ["c","f","j"], target = "a"
        Output: "c"
        Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

        Input: letters = ["x","x","y","y"], target = "z"
        Output: "x"
        Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].*/
public class SmallestLetter {

    public static void main(String[] args) {

        char[] characs = {'c', 'f', 'j', 'm'};
        System.out.println(nextGreatestLetter(characs, 'm'));

    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0 , end = letters.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(target < letters[mid])
                end = mid - 1; // if target is less than mid we go left
            else
                start = mid + 1;
        }
        return letters[start % letters.length]; // if start goes beyond the array we wrap around
    }
}
