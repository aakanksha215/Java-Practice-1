public class StringOperations {

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s);
        String s1 = "Java";
        String s2 = s + " " + s1;
        System.out.println(s2);
        char c = s1.charAt(2);
        int len = s1.length();
        System.out.println(len);
        System.out.println(c);
        System.out.println(s1 == s2);
        System.out.println(s.toUpperCase());
        System.out.println(s1.toLowerCase());
        // System.out.println(s.endWith('o'));
        String str = "Java is a programming language";
        String replaceStr = str.replace("Java", "C++");
        System.out.println(replaceStr);
    }
}
