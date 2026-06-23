public class OperatorPrecedence {
    public static void main(String[] args) {
        // Demonstrates how Java evaluates mixed expressions
        int result1 = 10 + 2 * 5;           // 20 (not 60)
        int result2 = (10 + 2) * 5;         // 60
        int result3 = 10 + 4 / 2 - 1;      // 11
        boolean result4 = 5 > 3 && 2 < 4;  // true
        boolean result5 = 5 > 3 || 2 > 4;  // true

        System.out.println("10 + 2 * 5       = " + result1);
        System.out.println("(10 + 2) * 5     = " + result2);
        System.out.println("10 + 4 / 2 - 1   = " + result3);
        System.out.println("5>3 && 2<4       = " + result4);
        System.out.println("5>3 || 2>4       = " + result5);
    }
}
