import java.util.*;

public class countNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int pos = 0;
        int neg = 0;
        int zero = 0;

        for (int j = 0; j < n; j++) {
            if (arr[j] < 0) {
                neg++;
            } else if (arr[j] > 0) {
                pos++;
            } else {
                zero++;
            }
        }
        System.out.println("Positive numbers are:" + pos);
        System.out.println("Negative numbers are:" + neg);
        System.out.println("Zero numbers are:" + zero);

    }

}
