package problems.LinearSearch;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
/*Input: nums = [12,345,2,6,7896]
        Output: 2
        Explanation:
        12 contains 2 digits (even number of digits).
        345 contains 3 digits (odd number of digits).
        2 contains 1 digit (odd number of digits).
        6 contains 1 digit (odd number of digits).
        7896 contains 4 digits (even number of digits).
        Therefore only 12 and 7896 contain an even number of digits*/
public class evenDigitNumbers {

    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

    }

    static int findNumbers(int[] nums) {

        //     int count = 0;
        //     for(int arr: nums){
        //         if(arr % 2 == 0){
        //             count++;
        //             System.out.println(count);
        //         }
        //     }
        //   return count;

        //   int count = 0;
        //     for(int i: nums){
        //         String s = String.valueOf(i);
        //         if(s.length()%2 == 0)
        //         count++;
        //     }
        //     return count;

        int count = 0;
        for(int arr: nums){
            // Math.log10(arr) +1 is to find the total digits in a number.
            int dig = (int)(Math.log10(arr)) +1;
            if(dig%2 == 0)
                count++;
        }
        return count;
    }
}
