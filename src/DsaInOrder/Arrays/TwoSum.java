package src.DsaInOrder.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 17;
        int sum =0;
        /* brute force ---- time complexity O(n^2)
        for(int i = 0; i<nums.length; i++){
            for (int j = i+1; j<nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    int[] result = {i, j};
                    System.out.println(Arrays.toString(result));
                }
            }
        }*/

      //  using Hashmap gives us the time complexity of O(n) the maximum we can achieve
        Map<Integer , Integer> map = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            int res = target - nums[i];
            if(map.containsKey(res)){
                System.out.println(i +" "+ map.get(res));
            }
            map.put(nums[i], i);
        }


    }
}
