package src.src.problems.SelectionSort;

import java.util.Arrays;

public class BasicSelectionSort {

    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 6, 3};
        System.out.println(Arrays.toString(selectSort(arr)));

    }

    static int[] selectSort(int[] arr){
        for(int k = 0; k < arr.length; k++) {
            int max = 0;
            int last = arr.length - k -1;
            for (int i = 0; i <= last; i++) {
                if (arr[max] < arr[i]) {
                    max = i;
                }
            }
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }

        return arr;
    }
}
