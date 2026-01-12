package src.DsaInOrder.Arrays;

import java.util.Arrays;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        String[] r1 = new String[nums.length];
        for(int i =0; i<nums.length; i++){
            if( i + 1 < nums.length && nums[i]+1 == nums[i+1]) {
                r1[i] = nums[i] + "->" + nums[i+1];
            } else{
                r1[i] = String.valueOf(nums[i]);
            }
        }
        System.out.println(Arrays.toString(r1));
    }
}
