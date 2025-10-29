import java.util.Scanner;

public class HypotenuseTriangle {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        double a;
        double b;
        double c;
        String askUser;
        boolean continueLoop = false;

        System.out.println("Welcome to my Hypotenuse of a triangle Calculator!");
        try {
            do {
                System.out.print("Enter side a: "); // Ask the user for side a and b.
                a = scan.nextDouble();

                System.out.print("Enter side b: ");
                b = scan.nextDouble();

                c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); //Given formula

                System.out.printf("The hypotenuse of a right triangle with %.2f cm, and %.2f cm is %.2f cm\n", a, b, c); // Output for hypotenuse.

                System.out.print("\nDo you still want to continue(YES or NO)?: "); // Aks the user to continue, or stop.
                askUser = scan.next();

                System.out.println();

                if (askUser.equalsIgnoreCase("YES")) {
                    continueLoop = true;
                } else if (askUser.equalsIgnoreCase("NO")) {
                    System.out.println("Thank you for using our Hypotenuse of a right triangle calculator!");
                    break;
                } else {
                    System.out.println("Invalid Input!");
                }

            } while (continueLoop);
        }catch (Exception e) {
            System.out.println("Please enter numbers only!");
        }
        scan.close();
    }
}
