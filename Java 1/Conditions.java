import java.util.*;
public class Conditions{
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if(age>18){
        //     System.out.print("You are an adult");
        // }
        // else{
        //      System.out.print("You not are an adult");
        // }
        // int n = sc.nextInt();
        // if(n%2 == 0){
        //      System.out.print("Even number");
        // }
        // else{
        //      System.out.print("Odd Number");
        // }

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b){
            System.out.print("Equal");
        }
        else if(a>b){
                System.out.print("a is greater");
            }
        else{
                System.out.print("b is greater");
            }
        
    }
}