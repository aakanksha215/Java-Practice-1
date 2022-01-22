import java.util.*;

public class circumCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        float r = sc.nextFloat();
        Circumference(r);
    }

    public static void Circumference(float r) {
        double c = 2 * (3.14) * r;
        System.out.println(c);
    }
}