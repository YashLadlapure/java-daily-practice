import java.util.Scanner;

public class EchoProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.println("You entered: " + sentence);
        System.out.println("Character count: " + sentence.length());

        sc.close();
    }
}
