package src.DsaInOrder.Arrays;

public class BuyAndSellStock {
    public static void main(String[] args) {
    int[] prices = {7,1,5,3,6,4};
    int n = Integer.MAX_VALUE;
    int m = 0;
    int ans = 0;
    for(int i =0; i<prices.length-1; i++) {
        if( prices[i] < n){
            n = prices[i];
        }
        // we fisrt find todays profit and then check if its greater than the overall profit we have till now
        //if not we make the highest days profit as the overall profit
        m = prices[i] - n;
        if(ans < m){
            ans = m;
        }
    }
        System.out.println(ans);
    }
}
