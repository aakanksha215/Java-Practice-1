import java.util.*;

public class String1 {
    public static void main(String args[]) {
        // String Declarination....
        // String name ="Tony";
        // String fullname = "Tony Stark";
        // String sentence = "My name is Tony Stark";

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close(); // nextLine is used to print whole name/line..
        System.out.print("Your name is:" + name);
    }
}