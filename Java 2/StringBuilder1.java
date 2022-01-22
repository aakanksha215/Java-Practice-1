//import java.util.*;

public class StringBuilder1 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at....
        System.out.println(sb.charAt(0));

        // set char at.....
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // insert.....
        sb.insert(0, 'S');
        System.out.println(sb);

        // delete...
        sb.delete(1, 2);
        System.out.println(sb);

        // append - insert at end.....
        sb.append("y");
        System.out.println(sb);

    }
}