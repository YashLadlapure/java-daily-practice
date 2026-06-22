import java.util.Scanner;

public class MultiTypeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        System.out.print("Enter a decimal number: ");
        double decimal = sc.nextDouble();

        sc.nextLine(); // consume leftover newline
        System.out.print("Enter a word: ");
        String word = sc.next();

        System.out.println("Integer: " + num);
        System.out.println("Decimal: " + decimal);
        System.out.println("Word: " + word);

        sc.close();
    }
}
