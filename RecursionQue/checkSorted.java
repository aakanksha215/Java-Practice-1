public class checkSorted {
    public static boolean isSorted(int A[], int i) {
        if (i == A.length - 1) {
            return true;
        }
        if (A[i] < A[i + 1]) {
            return isSorted(A, i + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int A[] = { 1, 3, 5 };
        // isSorted(A, 0);
        System.out.println(isSorted(A, 0));
    }

}
