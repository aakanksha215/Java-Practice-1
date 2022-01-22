//Printing subsequence of a given String......
public class Subsequence {
    public static void printSubsequence(String str, int i, String newStr) {
        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(i);
        printSubsequence(str, i + 1, newStr + currentChar);// currentchar in new String
        printSubsequence(str, i + 1, newStr);// current char not in new String
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubsequence(str, 0, "");
    }
}
