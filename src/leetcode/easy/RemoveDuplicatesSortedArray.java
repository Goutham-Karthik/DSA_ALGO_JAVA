package src.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesSortedArray {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        // create a dummy variable to keep the last element compared
        int index = 0;

        // loop through the values
        for(int i=0; i<nums.length; i++){
            if(nums[i] != nums[index]){
                index++;
                nums[index] = nums[i];
            }
        }
        System.out.println(index+1);
    }

//    public static void main(String[] args) {
//        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//
//        // Print the first element since it is always unique
//        System.out.print(nums[0] + " ");
//
//        // Loop through the array starting from the second element
//        for (int i = 1; i < nums.length; i++) {
//            // If the current element is different from the previous element
//            if (nums[i] != nums[i - 1]) {
//                // Print the current element
//                System.out.print(nums[i]);
//            }
//        }
//    }
}
