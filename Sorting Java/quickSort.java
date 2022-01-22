public class quickSort {

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap..
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;

    }

    public static void quickSorting(int arr[], int low, int high) {
        if (low < high) {
            int pivotInd = partition(arr, low, high);
            quickSorting(arr, low, pivotInd - 1);
            quickSorting(arr, pivotInd + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 9, 2, 4, 8 };
        int n = arr.length;

        quickSorting(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
