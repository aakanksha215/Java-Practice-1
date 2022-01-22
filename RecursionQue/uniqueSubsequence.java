import java.util.HashSet;

public class uniqueSubsequence {
    public static void printSubsequence(String str, int i, String newStr, HashSet<String> set) {
        if (i == str.length()) {
            if (set.contains(newStr)) {
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currentChar = str.charAt(i);
        printSubsequence(str, i + 1, newStr + currentChar, set);// currentchar in new String
        printSubsequence(str, i + 1, newStr, set);// current char not in new String
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();

        printSubsequence(str, 0, "", set);
    }

}
