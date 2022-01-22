//Place tiles of size 1xm ina floor of size nm......

public class Tiles {
    public static int palceTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        // for vertical placement
        int verticalPlacement = palceTiles(n - m, m);
        // for horizontal placements
        int horPlacements = palceTiles(n - 1, m);

        return verticalPlacement + horPlacements;
    }

    public static void main(String[] args) {
        int n = 4, m = 3;
        int totalplacements = palceTiles(n, m);
        System.out.println(totalplacements);
    }
}
