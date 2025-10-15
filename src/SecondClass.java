import java.util.Scanner;

public class SecondClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read inputs so conditions aren't compile-time constants
        System.out.print("Enter first number: ");
        double firstNum = Double.parseDouble(sc.nextLine().trim());

        System.out.print("Enter second number: ");
        double secondNum = Double.parseDouble(sc.nextLine().trim());

        double value = (firstNum + secondNum) * 100.0;
        System.out.println("My Total Value is: " + value);

        double remainder = value % 40.0;
        System.out.println("The remainder is " + remainder);

        // Compare doubles with an epsilon instead of ==
        final double EPS = 1e-9;
        boolean hasNoRemainder = Math.abs(remainder) < EPS;     // simplified: no ternary

        System.out.println("It doesn't have a remainder: " + hasNoRemainder);

        if (!hasNoRemainder) {
            System.out.println("Got some remainder");
        } else {
            System.out.println("You're correct!");
        }

        sc.close();
    }
}


