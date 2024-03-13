package src.leetcode.easy;

import java.util.*;
import java.util.stream.IntStream;

public class TwoSum {
//java 7 - brute force
       /* public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (target == nums[i] + nums[j]) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[]{};
        }*/

    //Hasmap - java7
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> minus = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            Integer mapval = minus.get(nums[i]);
            if(mapval!=null){
                return new int[]{mapval, i};
            }
            minus.put(target-nums[i], i);
        }
       return new int[]{};
    }

    //java 8
    /*public int[] twoSum(int[] nums, int target) {
        Optional<int[]> result = IntStream.range(0, nums.length - 1)
                .boxed()
                .flatMap(i -> IntStream.range(i+1, nums.length)
                        .filter(j -> target == nums[i] + nums[j])
                        .mapToObj(j -> Arrays.stream(new int[]{i, j}).toArray()))
                .findFirst();

        return result.orElse(new int[]{});
    }*/

    public static void main(String[] args) {
        TwoSum two = new TwoSum();
        System.out.println(Arrays.toString(two.twoSum(new int[]{5, 3, 4}, 7)));
    }
}
