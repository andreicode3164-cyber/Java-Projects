import java.util.Scanner;

public class CircumferenceCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double radius; // Declare Variables.
        double circumference;
        String askUser;
        boolean continueLoop = false;

        try { //Catch the wrong data type input error, specifically double.
            do {
                System.out.print("Enter the radius of the circle: "); // Ask user to enter the radius of the circle.
                radius = scan.nextDouble();

                circumference = 2 * Math.PI * radius; // Given Formula.

                System.out.printf("The circumference of the circle a radius of %.2f cm is %.2f cm\n", radius, circumference); // Output for circumference.

                System.out.print("\nDo you still want to continue(YES or NO)?: "); // Ask if you want to continue
                askUser = scan.next();

                System.out.println();

                if (askUser.equalsIgnoreCase("YES")) {
                    continueLoop = true;
                } else if (askUser.equalsIgnoreCase("NO")) {
                    System.out.println("Thank you for using our circumference of the circle calculator!");
                    break; // Stop the loop.
                } else {
                    System.out.println("Invalid Input!");
                }

            } while (continueLoop); // Repeat the program if the user says yes.
        } catch (Exception e) {
            System.out.println("Please enter numbers only!");
        }

        scan.close();
    }
}

