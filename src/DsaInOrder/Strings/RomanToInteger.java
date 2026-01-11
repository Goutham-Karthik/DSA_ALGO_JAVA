package src.DsaInOrder.Strings;

public class RomanToInteger {
    public static void main(String[] args) {
        String s ="MXI";
        int nums =0;
        int ans =0;
        int prev = 0;
        for(char c: s.toCharArray()){
            switch(c) {
                case 'I': nums =1; break;
                case 'V': nums =5; break;
                case 'X': nums =10; break;
                case 'L': nums =50; break;
                case 'C': nums =100; break;
                case 'D': nums =500; break;
                case 'M': nums =1000; break;
            }
            ans += nums;
            if(prev < nums){
                ans = ans - (2 * prev);
            }
            prev = nums;
        }
        System.out.println(ans);
    }
}
