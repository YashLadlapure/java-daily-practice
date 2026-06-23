public class LogicalOperators {
    public static void main(String[] args) {
        boolean x = true, y = false;

        System.out.println("x && y : " + (x && y));   // AND
        System.out.println("x || y : " + (x || y));   // OR
        System.out.println("!x     : " + (!x));        // NOT

        int a = 18;
        boolean isAdult = (a >= 18) && (a < 60);
        System.out.println("Is working age adult: " + isAdult);
    }
}
