public class power2 {
    public static int powerCalc(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return powerCalc(x, n / 2) * powerCalc(x, n / 2);
        } else {
            return powerCalc(x, n / 2) * powerCalc(x, n / 2) * x;
        }

    }

    public static void main(String[] args) {
        int ans = 1;
        ans = powerCalc(2, 5);
        System.out.println(ans);

    }

}
