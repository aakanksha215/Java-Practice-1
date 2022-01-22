//Remove all duplicates from string......

public class removeDup {
    public static boolean map[] = new boolean[26];

    public static void removeDuplicates(String str, int i, String newStr) {
        if (i == str.length()) {
            System.out.println(newStr);
        }
        char currentchar = str.charAt(i);
        if (map[currentchar - 'a'] == true) {
            removeDuplicates(str, i + 1, newStr);
        } else {
            newStr += currentchar;
            map[currentchar - 'a'] = true;
            removeDuplicates(str, i + 1, newStr);

        }

    }

    public static void main(String[] args) {
        String str = "abccaabca";
        removeDuplicates(str, 0, "");
    }
}
