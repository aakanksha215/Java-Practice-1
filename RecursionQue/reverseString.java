public class reverseString {
    public static void printRev(String str, int i) {
        if (i == 0) {
            System.out.println(str.charAt(i));
            return;
        }
        System.out.println(str.charAt(i));
        printRev(str, i - 1);
    }

    public static void main(String[] args) {
        String str = "Aakanksha Chamoli";
        printRev(str, str.length() - 1);
    }

}
// Time complexity = O(n)