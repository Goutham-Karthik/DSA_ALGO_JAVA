package src.src.problems.Recursion;

public class BinarySerachRecursion {

    public static void main(String[] args) {

        int[] nums = {2, 5, 9, 12, 19};
        System.out.println(bsRecursion(nums, 19, 0, nums.length-1));
    }

    static int bsRecursion(int[] arr, int n, int s , int e){
        if( s > e ) {
            return -1;
        }
            int m = s + (e-s) / 2;

            if(n == arr[m]){
                return m;
            } else if(n < arr[m]){
                return bsRecursion(arr, n, s, m-1);
            }else{
                return bsRecursion(arr, n, m+1, e);
            }
    }
}
