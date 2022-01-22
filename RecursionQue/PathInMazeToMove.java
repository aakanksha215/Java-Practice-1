//Count total paths in a maze to move from (0,0) to (n,m)........

public class PathInMazeToMove {
    public static int countPaths(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // move to down
        int downPAths = countPaths(i + 1, j, n, m);
        // move to right
        int rightPAths = countPaths(i, j + 1, n, m);

        return downPAths + rightPAths;

    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int totalPaths = countPaths(0, 0, n, m);
        System.out.println(totalPaths);
    }
}
