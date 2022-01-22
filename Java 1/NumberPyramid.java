import java.util.*;

public class NumberPyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // for(int i=1;i<=n;i++){ // Number Pyramid
        // for(int s=1;s<=n-i;s++){
        // System.out.print(" ");
        // }
        // for(int j=1;j<=i;j++){
        // System.out.print(i + " ");
        // }
        // System.out.print("\n");
        // }

        // Palidromic Pattern

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}