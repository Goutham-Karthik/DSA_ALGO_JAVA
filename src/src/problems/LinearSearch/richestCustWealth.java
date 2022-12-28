package problems.LinearSearch;

// https://leetcode.com/problems/richest-customer-wealth/
/*Example 1:

        Input: accounts = [[1,2,3],[3,2,1]]
        Output: 6
        Explanation:
        1st customer has wealth = 1 + 2 + 3 = 6
        2nd customer has wealth = 3 + 2 + 1 = 6
        Both customers are considered the richest with a wealth of 6 each, so return 6.*/

public class richestCustWealth {

    public static void main(String[] args) {

        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));

    }
    static int maximumWealth(int[][] accounts) {

        int max = Integer.MIN_VALUE;
        for(int[] rows: accounts){
            int wealth = 0;
            for(int col : rows){
                wealth += col;
            }
            if(wealth > max){
                max = wealth;
            }
        }
        return max;
    }
}