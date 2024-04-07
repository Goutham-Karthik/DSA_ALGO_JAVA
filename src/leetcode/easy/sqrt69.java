package src.leetcode.easy;

public class sqrt69 {

    public static void main(String[] args) {
        sqrt69 sq = new sqrt69();
        long target = 2147395599;
        long start = 0;
        long end= target;
        System.out.println(sq.biSearch(target,start, end));
    }

    public long biSearch(long target, long start, long end){
        while(start<=end){
            long mid = start + (end - start)/2;
            if(mid * mid > target){
                end = mid -1;
            } else if (mid * mid < target) {
                start = mid +1;
            }else {
                return mid;
            }
        }
        return end;
    }
}
