import java.util.*;

public class maxOfTwo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int a = sc.nextInt();
        int b = sc.nextInt();
        maxOfTwoNum(a, b);

    }

    public static void maxOfTwoNum(int a, int b) {
        if (a > b) {
            System.out.println("a is maximum");
        } else {
            System.out.println("b is maximum");
        }
    }
}