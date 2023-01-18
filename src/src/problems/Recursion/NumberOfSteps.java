package src.src.problems.Recursion;

public class NumberOfSteps {

    public static void main(String[] args) {

        System.out.println(numberOfSteps(14, 0));
    }

    static public int numberOfSteps(int num, int c) {

        if(num == 0){
            return c;
        }
        if(num %2 == 0){
            num = num/2;
        } else {
            num = num - 1;
        }
        return numberOfSteps(num, c+1);

    }
}
