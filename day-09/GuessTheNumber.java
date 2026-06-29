import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = 42;
        int guess;

        do {
            System.out.print("Guess the number (1-100): ");
            guess = sc.nextInt();

            if (guess < secret) {
                System.out.println("Too low!");
            } else if (guess > secret) {
                System.out.println("Too high!");
            }
        } while (guess != secret);

        System.out.println("Correct! The number was " + secret);
        sc.close();
    }
}
