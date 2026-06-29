import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a positive number: ");
            number = sc.nextInt();

            if (number <= 0) {
                System.out.println("Invalid input. Try again.");
            }
        } while (number <= 0);

        System.out.println("You entered: " + number);
        sc.close();
    }
}
