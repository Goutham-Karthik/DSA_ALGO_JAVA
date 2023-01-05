package src.src.problems.Patterns;

public class atreeNumberPattern {

    public static void main(String[] args) {
        treePattern(5);

    }

    static void treePattern(int n){
        for(int row = 1; row<= n; row++){

            int spaces = n- row;
            for(int s = 0 ; s <spaces; s ++){
                System.out.print("  ");
            }
            for(int col=row; col >=1; col--){
                System.out.print(col+" ");
            }
            for(int col =2; col<= row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
