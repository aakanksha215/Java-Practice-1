public class KeyPadCombination {
    public static String keypad[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "zy" };

    public static void printcom(String str, int i, String combination) {
        if (i == str.length()) {
            System.out.println(combination);
            return;
        }
        char currentchar = str.charAt(i);
        String mapping = keypad[currentchar - '0'];

        for (int j = 0; j < mapping.length(); j++) {
            printcom(str, j + 1, combination + mapping.charAt(j));
        }

    }

    public static void main(String[] args) {
        String str = "23";
        printcom(str, 0, "");
    }
}
