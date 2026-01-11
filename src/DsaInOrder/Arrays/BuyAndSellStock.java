package src.DsaInOrder.Arrays;

public class BuyAndSellStock {
    public static void main(String[] args) {
    int[] prices = {1,2};
    int n = Integer.MAX_VALUE;
    int m = 0;
    int ans = 0;
    for(int i =0; i<prices.length-1; i++) {
        if(n > prices[i]){
            n = prices[i];
        }
        if(m < prices[i+1] && prices[i+1] > n){
            m = prices[i+1];
        }
    }
        ans = m - n;
        System.out.println(ans);
    }
}
