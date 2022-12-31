package src.src.problems.BubbleSort;

import java.util.Arrays;

public class BasicBubbleSort {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(bubbleSort(arr)));

    }

    static int[] bubbleSort(int[] arr) {
        boolean flag;
        for(int i=0; i < arr.length ; i++){
            flag = false;
            for(int j=1; j < arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
return arr;
    }
}