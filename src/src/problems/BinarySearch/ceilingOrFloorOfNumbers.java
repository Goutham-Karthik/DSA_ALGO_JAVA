package problems.BinarySearch;

public class ceilingOrFloorOfNumbers {

    // Ceiling of a number means find the smallest number in the array > or = the target number the target number
    // Floor of a array is the biggest number in the array < or = the target number the target number
    public static void main(String[] args) {

        int[] nums = {2, 5, 9 , 15, 19, 25, 36, 48, 54};
        //System.out.println(binarySearch(nums, 37));
        System.out.println(nextGreatestLetter(new char[]{'c', 'f', 'j', 'm'}, 'j'));

    }

    static int binarySearch(int[] arr, int target){
        int start = arr[0];
        int end = arr.length - 1;
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


    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0 , end = letters.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(target < letters[mid])
                end = mid - 1; // if target is less than mid we go left
            else
                start = mid + 1;
        }
        return letters[start % letters.length]; // if start goes beyond the array we wrap around
    }
}