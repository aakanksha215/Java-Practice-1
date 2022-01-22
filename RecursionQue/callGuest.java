//Find the number of ways in which you can invinite n people to your party single or in pair...

public class callGuest {
    public static int callsToGuest(int n) {
        if (n <= 1) {
            return 1;
        }

        // only single guest
        int singleGuesst = callsToGuest(n - 1);

        // call in pair
        int pair = (n - 1) * callsToGuest(n - 2);

        return singleGuesst + pair;
    }

    public static void main(String[] args) {
        int n = 4;
        int totalWays = callsToGuest(n);
        System.out.println(totalWays);
    }
}
