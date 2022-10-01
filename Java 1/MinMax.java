public class MinMax {
    public static void findMinMax(int arr[], int N) {
        int mini = arr[0];
        int maxi = arr[0];

        for (int i = 0; i < N; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }
        System.out.println("Maximum element is : " + maxi);
        System.out.println("Minimum element is : " + mini);
    }

    public static void main(String args[]) {
        int arr[] = { 12, 4, 16, 11, 19, 7, 5, 1 };
        int N = 8;
        findMinMax(arr, N);
    }
}
