package src.DsaInOrder.Arrays;

import java.util.Arrays;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        String[] r1 = new String[nums.length];
        int Strt = nums[0];
        for(int i =0; i<nums.length; i++){
           while(i < nums.length-1 && nums[i] +1 == nums[i+1]){
               i++;
           }
           if(Strt != nums[i]) {
               r1[i] = Strt + "->" + nums[i];
           } else{
               r1[i] = String.valueOf(nums[i]);

           }
        }
        System.out.println(Arrays.toString(r1));
    }
}
