package src.src.problems.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTarget {

    public static void main(String[] args) {

        int[] arr = {1, 5, 2, 9, 9, 6, 8};
        System.out.println(target(arr, 9, 0));
    }

    static ArrayList<Integer> target(int[] arr, int target, int i ){
        ArrayList<Integer> list = new ArrayList<>();
        if(i == arr.length){
            return list;
        }

        if(arr[i] == target){
            list.add(i);
        }
        ArrayList<Integer> returnList = target(arr, target, i+1);
        list.addAll(returnList);
        return list;
    }
}
