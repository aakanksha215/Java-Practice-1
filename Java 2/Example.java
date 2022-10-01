public class Example {
    public static void binarySearch(int arr[], int low, int high, int key) {
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Element found at index :" + mid);
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int key = 30;
        int last = arr.length - 1;
        binarySearch(arr, 0, last, key);
    }
}
