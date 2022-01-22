// we have to transfer the disks from source tower to destinstion tower via
// helper tower....
// Rules:-
// 1.Only one disk transfered in 1step.
// 2.smaller disk are always kept on top of larger disk.
public class TowerOfHanoi {
    public static void towOfHan(int n, String so, String hel, String dest) {
        if (n == 1) {
            System.out.println("transfer d isk" + n + "from" + so + "to" + dest);
            return;
        }
        towOfHan(n - 1, so, dest, hel);
        System.out.println("transfer disk" + n + "from" + so + "to" + dest);
        towOfHan(n - 1, hel, so, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        towOfHan(n, "S", "H", "D");

    }
}
// Time Complexity=O(2^n)