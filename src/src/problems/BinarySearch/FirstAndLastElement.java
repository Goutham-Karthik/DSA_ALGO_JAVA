package src.src.problems.BinarySearch;

import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/867189952/

/*Example 1:

        Input: nums = [5,7,7,8,8,10], target = 8
        Output: [3,4]
        Example 2:

        Input: nums = [5,7,7,8,8,10], target = 6
        Output: [-1,-1]*/

public class FirstAndLastElement {

    public static void main(String[] args) {

        int[] nums = {2, 5, 9 , 9, 9, 9, 36, 48, 54};
        System.out.println(Arrays.toString(searchRange(nums, 10)));

    }
    static int[] searchRange(int[] nums, int target){
        int[] ans = {0,0};
        int start = search(nums, target, true );
        int end = search(nums, target, false );
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int search(int[] arr, int target, boolean firstElementIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while ( start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (firstElementIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        // to simply return the index of the target using binary search
        return ans;
        // to return the smallest number in the array > or = the target number the target number
        // return arr[start];
        // to return the biggest number in the array < or = the target number the target number
        //return arr[end];
    }
}
