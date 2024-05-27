import java.util.Scanner;

public class DrivingAllowance {

    String[] months = {"", "Januar", "Februar", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    int totalCashBack;
    int moneyBack;
    Scanner scan = new Scanner(System.in);

    public DrivingAllowance() {
        totalCashBack = 0;
    }

    // metode som holder vores inputs
    public int[] createDrivingAllowanceFromString() {
        int month = 0;
        int timesDriven = 0;
        try {
            String[] input = scan.nextLine().split(",");                   // Gør at jeg kan indtaste flere ting på samme linje og at det skal separeres ved ","
            month = Integer.parseInt(input[0]);                                  // Sætter month til at være en int
            if (month <= 0 || month > 12) {
                System.out.println("Invalid choice of month. Try again");
                return createDrivingAllowanceFromString();
            }
            timesDriven = Integer.parseInt(input[1]);                           // lagrer vores input som en int
            if (timesDriven <= 0 || timesDriven > 10) {
                System.out.println("Your times driven is either 0 or more than 10. Try again");
                return createDrivingAllowanceFromString();
            }
        } catch (NumberFormatException e) {
            System.out.println("Error. Input must be a number. Try again");
            return createDrivingAllowanceFromString();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You only gave one parameter, and thus an error happened. Try again");
            return createDrivingAllowanceFromString();
        }
        return new int[]{month, timesDriven};
    }

    public int calculateCashBack(int month, int timesDriven) {
        // Beregn godtgørelse med ternary if
        moneyBack = (month <= 6) ? timesDriven * 60 : timesDriven * 80;         // Smid i metode for sig
        totalCashBack += moneyBack;                                             // Sætter totalCashBack til at være = sig selv + moneyBack
        return moneyBack;                                                       // Returnerer moneyBack da jeg gerne vil vide hvad godtgørelse for den individuelle måned er

    }

    public void registerDrivesDialog() {
        System.out.println("Velkommen til RubberDuck BK's kørselsregistrering");
        while (true) {
            System.out.println("Angiv din kørsel nedenfor ved at skrive 1-12 for måned og antal kørsler i givne måned");
            System.out.println("Indtast venligst måned + antal gange (f.eks. 1,3)");

            int[] input = createDrivingAllowanceFromString();
            int month = input[0];
            int timesDriven = input[1];
            int moneyBack = calculateCashBack(month, timesDriven);

            System.out.println("Godtgørelse for " + months[month] + ": " + moneyBack + ",-"); //printer hvor meget tilbage i den givne måned.

            System.out.println("Forsæt med at registrere kørsel Y/N");
            String registerMore = scan.nextLine().toUpperCase();
            if (!registerMore.equals("Y")) {
                break;
            }
        }
        System.out.println("Tak fordi du kører drengene! " + totalCashBack + ",- vil blive sat ind på din konto om senest 5 bankdage");
        scan.close();

    }


}
