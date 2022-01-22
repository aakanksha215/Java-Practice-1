import java.util.*;

public class avg {
    public static void averageOfThree(int a, int b, int c) {
        int average = (a + b + c) / 2;
        System.out.println(average);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        averageOfThree(a, b, c);

    }
}