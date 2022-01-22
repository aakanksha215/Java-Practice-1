public class getBit {
    public static void main(String args[]) {
        int n = 5; // 0101
        int pos = 2;
        int bitMask = 1 << pos;
        int notbitMask = ~(bitMask);
        if ((bitMask & n) == 0) { // Get bit
            System.out.println("Bit ws 0");
        } else {
            System.out.println("Bit was 1");
        }

        int newNum = bitMask | n; // Set bit
        System.out.println(newNum);

        int newNum2 = notbitMask & n; // Clear bit
        System.out.println(newNum2);

        // int operation = 1; // update bit to 1 else update it to 0...

    }
}