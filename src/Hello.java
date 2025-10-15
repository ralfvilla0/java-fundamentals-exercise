import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, Ralf");

        System.out.print("Are you an alien (true/false)? ");
        boolean isAlien = Boolean.parseBoolean(sc.nextLine().trim());

        if (!isAlien) {
            System.out.println("It is not an alien!");
            System.out.println("I am not an alien!");
        }

        System.out.print("Enter top score: ");
        int topScore = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Enter second top score: ");
        int secondTopScore = Integer.parseInt(sc.nextLine().trim());


        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if (topScore > 90 && secondTopScore > 90) {
            System.out.println("Both scores are above 90");
        }

        System.out.print("Enter car make: ");
        String makeOfCar = sc.nextLine().trim();

        boolean isDomestic = !"Ferrari".equalsIgnoreCase(makeOfCar);

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        } else {
            System.out.println("This car is NOT domestic to our country");
        }

        String s = isDomestic ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        sc.close();
    }
}
