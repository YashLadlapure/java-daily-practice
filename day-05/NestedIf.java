import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Do you have a valid ID? (1 = yes, 0 = no): ");
        int hasID = sc.nextInt();

        if (age >= 18) {
            if (hasID == 1) {
                System.out.println("Access granted.");
            } else {
                System.out.println("Access denied: No valid ID.");
            }
        } else {
            System.out.println("Access denied: Must be 18 or older.");
        }

        sc.close();
    }
}
