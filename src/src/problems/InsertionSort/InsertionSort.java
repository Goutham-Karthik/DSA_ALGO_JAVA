package src.src.problems.InsertionSort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 1, 2};
        System.out.println(Arrays.toString(insertSort(arr)));
    }

    static int[] insertSort(int[] arr){
        for(int i =0; i< arr.length - 1; i++){
            for(int j=i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }
}


