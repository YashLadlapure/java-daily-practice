import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int reversed = 0;
        int temp = n;

        for (; temp != 0; temp /= 10) {
            reversed = reversed * 10 + temp % 10;
        }

        System.out.println("Reversed: " + reversed);
        sc.close();
    }
}
