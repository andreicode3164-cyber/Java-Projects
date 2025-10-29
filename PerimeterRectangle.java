
import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        double length;
        double width;
        double perimeter;
        String askUSer;
        boolean continueLoop = false;

        System.out.println("Welcome to Perimeter of a rectangle Calculator!");
        try {
            do {
                System.out.print("Enter the length of the rectangle: "); // Ask the user to enter the length, and width.
                length = scan.nextDouble();

                System.out.print("Enter the width of the rectangle: ");
                width = scan.nextDouble();

                perimeter = 2 * (length + width); // Given formula.

                System.out.printf("The perimeter of the rectangle with %.2f cm, and %.2f cm is %.2f cm\n",
                        length, width, perimeter); //Output for perimeter.

                System.out.print("\nDo you still want to continue(YES or NO)?: "); // Ask the user to continue, or not.
                askUSer = scan.next();

                System.out.println();

                if (askUSer.equalsIgnoreCase("YES")) {
                    continueLoop = true;
                } else if (askUSer.equalsIgnoreCase("NO")) {
                    System.out.println("Thank you for using our Perimeter of a rectangle calculator!");
                    break;
                } else {
                    System.out.println("Invalid Input!");
                }

            }while (continueLoop);
        } catch (Exception e) {
            System.out.println("Please enter numbers only!");
        }

        scan.close();
    }
}
