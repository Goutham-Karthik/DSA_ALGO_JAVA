package src.problems;

public class Fibonnaci {

    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    static int fib(int n){
        int sum = 0;
        for(int i=0; i < n; i++){
            int temp = sum + i;
            sum = i;
            i = temp;
        }
        return sum;
    }
}
