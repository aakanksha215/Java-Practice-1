//import java.util.*;
public class StringsFunction {
    public static void main(String args[]) {
        String firstname = "Tony";
        String lastname = "Stark";
        String fullname = firstname + " " + lastname; // Concatination......
        System.out.println(fullname);

        System.out.println(fullname.length()); // To find the length......

        for (int i = 0; i < fullname.length(); i++) { // charAt.......
            System.out.println(fullname.charAt(i));
        }

        if (firstname.compareTo(lastname) == 0) { // compareTo
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        if (firstname == lastname) { // compareTo
            System.out.println("Strings are equal"); // == will fail some testcases..
        } else {
            System.out.println("Strings are not equal");
        }

        String sentence = "My name is Tony"; // substring........
        String name = sentence.substring(4, sentence.length());
        System.out.print(name);

    }
}

// Strings are immutable......