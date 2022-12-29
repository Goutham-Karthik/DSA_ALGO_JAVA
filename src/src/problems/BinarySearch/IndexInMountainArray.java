package src.src.problems.BinarySearch;

// https://leetcode.com/problems/find-in-mountain-array/

/*Input: array = [1,2,3,4,5,3,1], target = 3
        Output: 2
        Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.*/

public class IndexInMountainArray {

    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 3, 5, 6, 5, 4, 3, 1};
        //System.out.println(binarySearch(nums, 37));
        System.out.println(search(nums, 4));

    }

    static int search(int[] nums, int target) {
        int peak = peakBinarySearch(nums);
        int firstOccurence = ASC_DSC_BinarySearch(nums, target, 0, peak);
        if (firstOccurence != -1) {
            return firstOccurence;
        } else {
            return ASC_DSC_BinarySearch(nums, target, peak + 1, nums.length - 1);
        }

    }

    static int peakBinarySearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        // to simply return the index of the target using binary search
        return start;
        // to return the smallest number in the array > or = the target number the target number
        // return arr[start];
        // to return the biggest number in the array < or = the target number the target number
        //return arr[end];
    }

    static int ASC_DSC_BinarySearch(int[] nums, int target, int start, int end) {

        boolean ASC = nums[start] < nums[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if( nums[mid] == target){
                return mid;
            }
            if (ASC) {
                if( target < nums[mid]){
                    end = mid -1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else {
                if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            // to simply return the index of the target using binary search
            // to return the smallest number in the array > or = the target number the target number
            // return arr[start];
            // to return the biggest number in the array < or = the target number the target number
            //return arr[end];
        }
        return -1;
    }
}