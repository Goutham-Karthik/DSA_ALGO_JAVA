package src.src.problems.CycleSort;

import java.util.ArrayList;

public class FindDuplicate {
    public static void main(String[] args) {

        int[] nums = {4, 1, 2, 5, 1};
        System.out.println(cycleSort(nums));
    }

    static int cycleSort(int[] nums){
        int start = 0;
        while(start < nums.length){
            int correct = nums[start] -1;
            if(nums[start] != nums[correct]){
                int temp = nums[start];
                nums[start] = nums[correct];
                nums[correct] = temp;
            } else {
                start++;
            }

        }
        int n = 0;
        for(int i =0; i< nums.length; i++){
            if(nums[i] != i+1){
                n = nums[i];
            }
        }

        return n;
    }
}
