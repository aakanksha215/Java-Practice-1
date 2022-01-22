import java.util.*;

public class problemsOnPattern {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // Printing rectangular * pattern
        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=n;j++){
        // System.out.print("*");
        // }
        // System.out.print("\n");
        // }

        // int n = 6;
        // int m = 5;
        // for(int i=1;i<=n;i++){ // Printing hollo rectangle * pattern
        // for(int j=1;j<=m;j++){
        // if(i==1 || j==1 || i==n || j==m){
        // System.out.print("*");
        // }else{
        // System.out.print(" ");
        // }
        // }
        // System.out.print("\n");
        // }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // int m = sc.nextInt();

        // for(int i=1;i<=n;i++){ // Half Pyramid
        // for(int j=1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.print("\n");
        // }

        // for(int i=n;i>=1;i--){
        // for(int j=1;j<=i;j++){
        // System.out.print("*"); // Inverted half pyramid
        // }
        // System.out.print("\n");
        // }

        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=n;j++){ // Inverted-Rotated Half pyramid
        // if(i+j<=n){
        // System.out.print(" ");
        // }else{
        // System.out.print("*");
        // }
        // }
        // System.out.print("\n");
        // }

        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print(j+" "); //Printing numbers
        // }
        // System.out.print("\n");
        // }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }

    }
}