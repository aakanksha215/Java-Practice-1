//Print all permutations of a string.....
public class permutationOfString {
    public static void printPer(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // "abc"->"ac"||"ab"||"cb"
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPer(newStr, permutation + currentChar);
        }
    }// Time Complexity = O(n!)

    public static void main(String[] args) {
        String str = "abc";
        printPer(str, "");
    }
}
