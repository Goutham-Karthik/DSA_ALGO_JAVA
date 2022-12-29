package src.src.problems.BinarySearch;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class MountainArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 7, 6, 4, 3, 2};
        System.out.println(binarySearch(nums));
    }


    static int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while ( start < end){
            int mid = start + ( end - start) / 2;
            if( arr[mid] > arr[mid+1]){
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
}
