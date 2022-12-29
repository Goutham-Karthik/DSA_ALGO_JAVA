package src.src.problems.BinarySearch;

import java.util.Arrays;

public class InfiniteArray {

    public static void main(String[] args) {
        int[] nums = {2, 5, 9, 12, 19, 23, 36, 48, 54, 61, 65, 72, 83, 86, 89, 92, 96};
        System.out.println(ans(nums, 61));
    }

        static int ans(int[]nums, int target){

            int start = 0;
            int end = 1;
            while(target > nums[end]){
                int temp = end +1;
                end = end +( end - start + 1) * 2;
                start = temp;
            }
            return binarySearch(nums, target, start, end );

        }

    static int binarySearch(int[] arr, int target, int start, int end){
        while ( start <= end){
            int mid = start + ( end - start) / 2;
            if( target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
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
