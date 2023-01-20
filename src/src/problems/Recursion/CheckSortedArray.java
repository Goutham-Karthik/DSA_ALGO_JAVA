package src.src.problems.Recursion;

import java.util.Arrays;

public class CheckSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 9, 6, 8};
        System.out.println(Arrays.toString(sortArray(arr, 0)));

    }

    static int[] sortArray(int[] arr, int i){
        if(i == arr.length-1){
            return arr;
        }

        if(arr[i] > arr[i+1]){
            int temp = arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp;
            return sortArray(arr, i+1);
        }

        return sortArray(arr, i+1);
    }
}
