//Move all x to end of the string....
public class MovexToEnde {
    public static void moveAllx(String str, int i, int count, String newStr) {
        if (i == str.length()) {
            for (int j = 0; j < count; j++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(i);
        if (currentChar == 'x') {
            count++;
            moveAllx(str, i + 1, count, newStr);
        } else {
            newStr += currentChar;
            moveAllx(str, i + 1, count, newStr);
        }

    }// Time complexity = O(n+count)

    public static void main(String[] args) {
        String str = "axbbcxxca";
        moveAllx(str, 0, 0, "");
    }

}
