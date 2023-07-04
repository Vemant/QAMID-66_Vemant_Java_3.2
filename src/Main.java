import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a current account");
        int currAccount = in.nextInt();
        System.out.println("Enter an addition");
        int addition = in.nextInt();

        int finAccount = currAccount + addition;
        System.out.println("Final account is " +  finAccount);

        if (addition > 1000) {
            System.out.println("Your bonus is " + addition / 100);
        } else {
            System.out.println("Your bonus is 0");
        }
    }
}