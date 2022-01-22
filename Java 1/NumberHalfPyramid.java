import java.util.*;
public class NumberHalfPyramid{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // for(int i=1;i<=n;i++){           // Number Pyramid.......
        //     for(int s=1;s<=n-i;s++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.print("\n");
        // }


        // Number half pyramid....

        for(int i=n;i>=1;i--){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }
    }
}