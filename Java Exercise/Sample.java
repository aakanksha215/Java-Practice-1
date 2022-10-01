public class Sample {
    int a, b, c;

    int calc(int x, int y) {
        a = x;
        b = y;
        c = a + b;
        return c;
    }

    public static void main(String args[]) {
        Sample ob = new Sample();
        int t = ob.calc(2, 7);
        System.out.println(t);
    }
}
