import java.util.Scanner;

public class DrivingAllowance {

    private String[] months = {"", "Januar", "Februar", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private int totalCashBack;
    private int moneyBack;
    private Scanner scan = new Scanner(System.in);

    public DrivingAllowance() {
        totalCashBack = 0;
    }

    // Method that takes input and parses it to data we can handle. In this case Integers. Included is a try catch to ensure our program runs, even if input is faulty.
    // Returns a new int [] that we use in our dialog method
    public int[] createDrivingAllowanceFromString() {
        int month = 0;
        int timesDriven = 0;
        try {
            String[] input = scan.nextLine().split(",");                   // Since the program is a system.in, this array of strings makes it possible to type in several things separated by ","

            month = Integer.parseInt(input[0]);                                  // Stores the input as an int
            if (month <= 0 || month > 12) {
                System.out.println("Invalid choice of month. Try again");
                return createDrivingAllowanceFromString();
            }

            timesDriven = Integer.parseInt(input[1]);                           // Stores the input as an int
            if (timesDriven <= 0 || timesDriven > 10) {
                System.out.println("Your times driven is either 0 or more than 10. Try again");
                return createDrivingAllowanceFromString();
            }

        } catch (NumberFormatException e) {                                     // A catch that handles a situation where input is not a number.
            System.out.println("Error. Input must be a number. Try again");
            return createDrivingAllowanceFromString();

        } catch (ArrayIndexOutOfBoundsException e) {                            // A catch that handles a situation where an array has been accessed with an illegal index.
            System.out.println("You only gave one parameter, and thus an error happened. Try again");
            return createDrivingAllowanceFromString();
        }
        return new int[]{month, timesDriven};
    }

    public int calculateCashBack(int month, int timesDriven) {
        // Beregn godtgørelse med ternary if
        moneyBack = (month <= 6) ? timesDriven * 60 : timesDriven * 80;         // Ternary if statement where if true do left side, if false do right side.
        totalCashBack += moneyBack;                                             // Sets totalCashBack to be = to it self + moneyBack
        return moneyBack;                                                       // Returns moneyBack since i would like to know how much will be returned for the individual month.

    }

    public void registerDrivesDialog() {
        System.out.println("Velkommen til RubberDuck BK's kørselsregistrering");
        while (true) {
            System.out.println("Angiv din kørsel nedenfor ved at skrive 1-12 for måned og antal kørsler i givne måned");
            System.out.println("Indtast venligst måned + antal gange (f.eks. 1,3)");

            int[] input = createDrivingAllowanceFromString();       // instantiating a new int [] which has been through the validating method.
            int month = input[0];                                   // Stores input[0] in an int month variable
            int timesDriven = input[1];                             // Same as above
            int moneyBack = calculateCashBack(month, timesDriven);  // Stores the calculations in our cashBack method in an int moneyBack variable

            System.out.println("Godtgørelse for " + months[month] + ": " + moneyBack + ",-"); // Prints moneyBack for the input month.

            System.out.println("Forsæt med at registrere kørsel Y/N?"); // The following code asks if we want to continue
            String registerMore = scan.nextLine().toUpperCase();
            if (!registerMore.equals("Y")) {                           // If we type "Y" we will repeat the loop.
                break;                                                 // If we type "N" we break out of the loop.
            }
        }
        System.out.println("Tak fordi du kører drengene! " + totalCashBack + ",- vil blive sat ind på din konto om senest 5 bankdage");
        scan.close();

    }


}
