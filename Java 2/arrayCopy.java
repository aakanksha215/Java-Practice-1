public class arrayCopy {
    public static void main(String[] args) {
        int a[] = { 2, 4, 3 };
        int b[] = new int[3];
        b = a;
        b[0]++;
        for (int i = 0; i < 3; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        int c[] = new int[3];
        c[0]++;

        for (int i = 0; i < 3; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

        int d[] = a.clone();
        d[1]++;
        for (int i = 0; i < 3; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();

        int e[] = new int[3];
        e[0]++;
        System.arraycopy(a, 0, e, 0, 3);
        for (int i = 0; i < 3; i++) {
            System.out.print(e[i] + " ");
        }
    }
}
