import java.util.*;

public class linearSearch2Darray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();

        int arr[][] = new int[rows][column];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.print("\n");
        }
        int element = sc.nextInt();
        sc.close();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j] == element) {
                    System.out.print("The element found at index:" + "(" + i + "," + j + ")");
                }

            }

        }

    }
}