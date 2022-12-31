package src.src.problems.CycleSort;

import java.util.Arrays;


public class BasicCycleSort {

    public static void main(String[] args) {

        int[] arr = {4, 3, 1, 2};
        System.out.println(Arrays.toString(cycleSort(arr)));
    }

    static int[] cycleSort(int[] arr){
        int start = 0;
        while (start < arr.length){
            int correct = arr[start] - 1;
            if(arr[correct] != arr[start]){
                int temp = arr[start];
                arr[start] = arr[correct];
                arr[correct] = temp;
            } else{
                start++;
            }
        }
        return arr;
    }
}
