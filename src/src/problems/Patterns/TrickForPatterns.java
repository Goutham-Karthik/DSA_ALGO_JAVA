package src.src.problems.Patterns;

public class TrickForPatterns {

    public static void main(String[] args) {

        pattern(5);

    }

    static void pattern(int n){
        for(int row = 0; row < 2 * n; row ++){
            int totalcols = row > n ? 2 * n - row: row;

            int spaces = n- totalcols;
            for(int s= 0; s < spaces; s++){
                System.out.print(" ");
            }
            for(int col = 0; col< totalcols; col ++){
                 System.out.print("* ");
            }
            System.out.println();
        }
    }
}
