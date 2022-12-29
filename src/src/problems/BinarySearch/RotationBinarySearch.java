package src.src.problems.BinarySearch;

// https://leetcode.com/problems/search-in-rotated-sorted-array/

/*Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

        You must write an algorithm with O(log n) runtime complexity.



        Example 1:

        Input: nums = [4,5,6,7,0,1,2], target = 0
        Output: 4*/
public class RotationBinarySearch {

    public static void main(String[] args) {

        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums, 0));

    }

    static int search(int[] nums, int target){

        int peak = pivot(nums);
        if(peak ==-1){
            return binarySearch(nums, target, 0, nums.length -1);
        } else if( nums[peak] == target){
            return peak;
        }else if( target >= nums[0] ){
            return binarySearch(nums, target, 0, peak -1);
        } else {
            return binarySearch(nums, target, peak +1, nums.length-1);
        }

    }

    static int pivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while( start <= end) {
            int mid = start + (end - start) / 2;
            if ( mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if ( mid > start && nums[mid] < nums[mid - 1]) {
                return mid -1;
            } else if(nums[mid] <= nums[start]){
                end = mid-1;
            } else{
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] nums, int target, int start, int end){
        while ( start <= end){
            int mid = start + ( end - start) / 2;
            if( target < nums[mid]){
                end = mid -1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        // to simply return the index of the target using binary search
        return -1;
        // to return the smallest number in the array > or = the target number the target number
        // return arr[start];
        // to return the biggest number in the array < or = the target number the target number
        //return arr[end];
    }
}
