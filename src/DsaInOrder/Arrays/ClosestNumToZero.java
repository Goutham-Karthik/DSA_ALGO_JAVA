package src.DsaInOrder.Arrays;

public class ClosestNumToZero {
// chech of absolute value if number is close to zero
//the absolute value of -1 and 1 is the same in that case we need to compare the two number to find the greatest
//(Math.abs(nums[i]) == Math.abs(closest) && nums[i]> closest
    public static void main(String[] args) {
        int[] nums ={-4, -2,-1, 1, 2, 3};
        int closest = nums[0];
        for(int i =1; i<nums.length-1; i++){
            if(Math.abs(nums[i]) < Math.abs(closest) || (Math.abs(nums[i]) == Math.abs(closest) && nums[i]> closest )){
                closest =nums[i];
            }
        }
        System.out.println(closest);
    }
}
