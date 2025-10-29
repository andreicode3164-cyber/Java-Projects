import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        char unit;
        double temp;
        double celsius;
        double fahrenheit;
        String askUser;
        boolean continueLoop = false;

        System.out.println("Welcome to my Temperature Converter!");
            do {
                System.out.print("Please select a unit(C or F)?: "); // Ask the user to select which unit.
                unit = scan.next().toUpperCase().charAt(0);
                try {
                    switch (unit) { // If the user choose the unit, it will execute the case with that unit/condition.
                        case 'C':
                            System.out.print("Please enter the number: ");
                            temp = scan.nextDouble();
                            celsius = (temp - 32) * 5/9;
                            System.out.printf("The temperature of %.2f F to C is: %.2f C\n", temp, celsius);
                            break;
                        case 'F':
                            System.out.print("Please enter the number: ");
                            temp = scan.nextDouble();
                            fahrenheit = (temp * 9/5) + 32;
                            System.out.printf("The temperature of %.2f C to F is %.2f F\n", temp, fahrenheit);
                            break;
                        default:
                            System.out.println("Invalid Input!");
                            break;
                    }

                    System.out.print("\nDo you want to continue(YES or NO)?: "); // Ask the user to continue, or not.
                    askUser = scan.next();

                    System.out.println();

                    if (askUser.equalsIgnoreCase("YES")) {
                        continueLoop = true;
                    } else if (askUser.equalsIgnoreCase("NO")) {
                        System.out.println("Thank you for using our Temperature Converter Calculator!");
                        break;
                    }
                }catch (Exception e) {
                    System.out.println("Please enter numbers only!");
                }
            } while (continueLoop);

        scan.close();
    }
}
