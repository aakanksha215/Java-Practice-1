//Find the first and last occurence of element in a string....

public class occurence {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurence(String str, int i, char element) {
        if (i == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar = str.charAt(i);
        if (currentChar == element) {
            if (first == -1) {
                first = i;
            } else {
                last = i;
            }
        }
        findOccurence(str, i + 1, element);

    }// Time Complexity = O(n)

    public static void main(String[] args) {
        String str = "Aakanksha";
        findOccurence(str, 0, 'a');
    }

}
