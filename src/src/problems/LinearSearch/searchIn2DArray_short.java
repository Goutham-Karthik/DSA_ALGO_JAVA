package src.src.problems.LinearSearch;

import java.util.Arrays;

public class searchIn2DArray_short {

    public static void main(String[] args) {

        /* the below array is not a properly sorted row, column array...
         hence no binary search and we have implemented an alternative approach*/

        int[][] arr = {
                {10, 20, 30, 40},
                {12, 22, 32, 42},
                {15, 25, 35, 45},
                {18, 28, 38, 48}
        };

        System.out.println(Arrays.toString(search(arr, 12)));

    }

    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length - 1;

        while( row < matrix.length){
            if(matrix[row][col] == target){
                return new int[]{row, col};
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
