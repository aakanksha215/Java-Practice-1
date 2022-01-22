import java.util.*;

public class vote {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        eligibleToVote(age);
        sc.close();

    }

    public static void eligibleToVote(int age) {
        if (age > 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

    }
}