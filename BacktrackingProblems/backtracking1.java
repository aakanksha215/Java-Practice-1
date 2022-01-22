//Find total permutation for arrenging ABC.....
public class backtracking1 {
    public static void printPermutations(String str, String permutation, int i) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int j = 0; j < str.length(); j++) {
            char currentchar = str.charAt(j);
            String newstr = str.substring(0, j) + str.substring(j + 1);
            printPermutations(newstr, permutation + currentchar, i + 1);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printPermutations(str, "", 0);

    }// Time Complexity = O(n*n!)
}