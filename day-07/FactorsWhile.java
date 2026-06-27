import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        int i = 1;
        System.out.print("Factors of " + n + ": ");

        while (i <= n) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println();
        sc.close();
    }
}
