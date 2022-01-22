
public class power {
    public static int powerCalc(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int p1 = powerCalc(x, n - 1);
        int p = p1 * x;
        return p;

    }

    public static void main(String[] args) {
        int ans = 1;
        ans = powerCalc(2, 5);
        System.out.println(ans);

    }

}
