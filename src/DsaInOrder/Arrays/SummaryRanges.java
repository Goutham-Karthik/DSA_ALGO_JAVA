package src.DsaInOrder.Arrays;

import java.util.Arrays;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        String[] r1 = new String[nums.length];
        for(int i =0; i<nums.length; i++){
           while(i < nums.length && nums[i] +1 == nums[i]){
               i++;
           }
           if(nums[i] +1 != nums[i]){
               r1[i] = r1[i] + "->" +nums[i];

           } else {
               r1[i] = String.valueOf(nums[i]);
           }
        }
        System.out.println(Arrays.toString(r1));
    }
}
