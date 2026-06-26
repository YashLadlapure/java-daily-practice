import java.util.Scanner;

public class SimpleSwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Say Hello");
        System.out.println("2. Say Goodbye");
        System.out.println("3. Say Thank You");
        System.out.print("Enter your choice (1-3): ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Hello!");
                break;
            case 2:
                System.out.println("Goodbye!");
                break;
            case 3:
                System.out.println("Thank you!");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
