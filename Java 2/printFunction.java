import java.util.*;

public class printFunction {

    // public static void printMyName(String name){
    // System.out.print(name);
    // return;
    // }

    // public static void main(String args[]){
    // Scanner sc = new Scanner(System.in);
    // String name = sc.next();

    // printMyName(name);
    // }

    public static int sumOfTwo(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = sumOfTwo(a, b);
        System.out.print("the sum of a and b is:" + sum);
    }
}