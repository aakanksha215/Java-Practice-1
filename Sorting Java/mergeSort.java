
public class mergeSort {

    public static void conqure(int arr[], int low, int mid, int high) {
        int brr[] = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                brr[k] = arr[i];
                i++;
                k++;
            } else {
                brr[k] = arr[j];
                k++;
                j++;
            }
        }
        while (i <= mid) {
            brr[k] = arr[i];
            k++;
            i++;
        }
        while (j <= high) {
            brr[k] = arr[j];
            k++;
            j++;
        }
        for (int l = low, m = 0; m < brr.length; m++, l++) {
            arr[l] = brr[m];
        }

    }

    public static void divide(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        divide(arr, low, mid);
        divide(arr, mid + 1, high);
        conqure(arr, low, mid, high);

    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 9, 2, 4, 8 };
        int n = arr.length;

        divide(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
