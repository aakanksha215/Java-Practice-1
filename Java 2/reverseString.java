import java.util.*;

public class reverseString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        System.out.println("Your string is: " + sb);
        sc.close();
        // int start = 0;
        // int end = sb.length()-1;
        // int temp;

        // while(start<end){
        // temp = sb.charAt(start);
        // sb.charAt(start) = sb.charAt(end);
        // sb.charAt(end) = temp;
        // start++;
        // end--;
        // }
        // System.out.println(sb);

        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println("Reverse string is:" + sb);

    }
}