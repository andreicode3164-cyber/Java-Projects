import java.util.Scanner;

public class AreaCircle {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        double radius;
        double area;
        String askUser;
        boolean continueLoop = false;

        try {
            do {
                System.out.print("Enter the radius of the circle: "); // Ask the user for radius.
                radius = scan.nextDouble();

                area = Math.PI * Math.pow(radius, 2); // Given formula.

                System.out.printf("The area of the circle with a radius of %.2f cm is %.2f cm\n", radius, area); // Output of area.

                System.out.print("\nDo you still want to continue(YES or NO)?: "); // Ask the user to continue or stop.
                askUser = scan.next();

                if (askUser.equalsIgnoreCase("YES")) {
                    continueLoop = true;
                } else if (askUser.equalsIgnoreCase("NO")) {
                    System.out.println("Thank you for using our area of the circle calculator!");
                    break; // Stop the loop if the user says NO.
                } else {
                    System.out.println("Invalid Input!");
                }

            }while (continueLoop);
        }catch (Exception e) {
            System.out.println("Please enter numbers only!");
        }

        scan.close();
    }
}
