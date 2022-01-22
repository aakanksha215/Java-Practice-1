public class factorial {
    public static int fact(int n) {
        if (n == 0 || n == 1) { // Base condition
            return 1;
        }
        int f = fact(n - 1); // Calling itself....
        int factorialOfNum = n * f; // Work to be done....
        return factorialOfNum;

    }

    public static void main(String[] args) {
        int n = 5;
        int ans = fact(n);
        System.out.println(ans);

    }

}
