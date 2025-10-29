import java.util.Scanner;

public class WeightConverter {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        String unit;
        double weight;
        double KG;
        double LB;
        String askUser;
        boolean continueLoop = false;

        System.out.println("Welcome to my Weight Converter!");
            do {
                System.out.print("Please select a unit(KG or LB)?: "); // Ask the user which unit to convert.
                unit = scan.next().toUpperCase();
                try {
                switch (unit) { // The program will look for the case with the match input.
                    case "KG":
                        System.out.print("Enter the weight: ");
                        weight = scan.nextDouble();
                        KG = weight / 2.205;
                        System.out.printf("The measure weight from %.2f LB to KG is %.2f KG.\n", weight, KG);
                        break;
                    case "LB":
                        System.out.print("Enter the weight: ");
                        weight = scan.nextDouble();
                        LB = weight * 2.205;
                        System.out.printf("The measure of weight from %.2f KG to LB is %.2f LB.\n", weight, LB);
                        break;
                    default:
                        System.out.println("Invalid Input!");
                        break;
                }

                System.out.print("\nDo you want to continue(YES or NO)?: "); // Ask the user to continue, or stop.
                askUser = scan.next();

                    System.out.println();

                if (askUser.equalsIgnoreCase("YES")) {
                    continueLoop = true;

                } else if (askUser.equalsIgnoreCase("NO")) {
                    System.out.println("Thank you for using our Weight Converter Calculator!");
                    break;
                } else {
                    System.out.println("Invalid Input!");
                }
                } catch (Exception e) {
                    System.out.println("Please enter numbers only!");
                    break;
                }
            }while (continueLoop);

        scan.close();
    }
}
