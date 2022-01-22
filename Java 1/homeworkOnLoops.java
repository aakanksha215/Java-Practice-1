import java.util.*;
public class homeworkOnLoops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // for(int i=1;i<=n;i++){
        //     if(i%2==0){            //Printing even numbers
        //         System.out.println(i);
        //     }
        // }

        // for( ;  ;){
        //     System.out.println("Hello");   //It will not run because we wont increment anything.
        // }

        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("Not a prime number");
                break;
            }else{
                System.out.println("Prime number");
            }
        }

    }
}