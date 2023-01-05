package src.src.problems.Patterns;

public class DiamondNumberPattern {

    public static void main(String[] args) {

        diamondPattern(5);
    }

    static void diamondPattern(int n){

        for(int row = 1; row<= 2 * n; row++){

            int rowNo = row > n ? 2 * n -row : row ;

            for(int s = 0 ; s < n - rowNo; s ++){
                System.out.print(" ");
            }
            for(int col=rowNo; col >=1; col--){
                System.out.print(col+"");
            }
            for(int col =2; col<= rowNo; col++){
                System.out.print(col+"");
            }
            System.out.println();
        }

    }
}
