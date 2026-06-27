import java.util.Scanner;

public class PowerUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (a): ");
        int a = sc.nextInt();

        System.out.print("Enter exponent (b >= 0): ");
        int b = sc.nextInt();

        int result = 1;
        int i = 0;

        while (i < b) {
            result *= a;
            i++;
        }

        System.out.println(a + " ^ " + b + " = " + result);
        sc.close();
    }
}
