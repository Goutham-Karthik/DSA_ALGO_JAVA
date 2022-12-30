package src.src.problems.BinarySearch;

// https://leetcode.com/problems/split-array-largest-sum/

/*
Input: nums = [7,2,5,10,8], k = 2
        Output: 18
        Explanation: There are four ways to split nums into two subarrays.
        The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
*/

public class SplitArrayLargestSum {

    public static void main(String[] args) {

        int[] nums = {7,2,5,10,8};
        System.out.println(splitArray(nums, 2));
    }

    static int splitArray(int[] nums, int m){
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];

        }

        while(start< end){
            int sum = 0;
            int pieces = 1;
            int mid = start + (end - start) / 2;

        for( int arr: nums){
            if(sum + arr > mid){
                sum = arr;
                pieces++;
            } else{
                sum += arr;
            }
        }

        if( pieces > m){
            start = mid + 1;
        }else {
            end = mid;
        }
        }

 return end;
    }
}
