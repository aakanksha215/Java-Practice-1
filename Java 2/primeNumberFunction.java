import java.util.*;

public class primeNumberFunction {
    public static void priNum(int n) {
        int check = 0;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                System.out.println(n
                        + "is not a prime number");
                check = 1;
                break;
            }
        }
        if (check == 0) {
            System.out.println(n + "is prime number");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        priNum(n);
    }
}