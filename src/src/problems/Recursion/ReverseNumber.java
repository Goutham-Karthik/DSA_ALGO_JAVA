package src.src.problems.Recursion;

public class ReverseNumber {

    public static void main(String[] args) {

        rev(12345);
        System.out.println(sum);
    }

    static int sum =0;
    static void rev(int n){
        if(n == 0){
            return;
        }

        int rem = n%10;
        sum = rem + sum *10;

        rev(n/10);

    }
}
