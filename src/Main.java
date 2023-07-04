import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a current account");
        int currAccount = in.nextInt();
        System.out.println("Enter an addition");
        int addition = in.nextInt();
        int bonus = 0;

        if (addition > 1000) {
            bonus = addition / 100;
        }
        int finAccount = currAccount + addition + bonus;

        System.out.println("Your bonus is " + bonus);
        System.out.println("Final account is " + finAccount);

    }
}