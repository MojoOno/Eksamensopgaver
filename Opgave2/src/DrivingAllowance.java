import java.util.Scanner;

public class DrivingAllowance {
    String[] months = {"", "Januar", "Februar", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    int totalCashBack;
    Scanner scan = new Scanner(System.in);

    public DrivingAllowance(){
        totalCashBack = 0;

    }

    public void registerDrivesDialog(){
        System.out.println("Velkommen til RubberDuck BK's kørselsregistrering");
        while(true) {
            System.out.println("Angiv din kørsel nedenfor ved at skrive 1-12 for måned og antal kørsler i givne måned");
            System.out.println("Indtast venligst måned + antal gange (f.eks. 1,3)");

            String[] input = scan.nextLine().split(","); // Gør at jeg kan indtaste flere ting på samme linje og at det skal separeres ved ","
            int month = Integer.parseInt(input[0]); // sætter month til at være og en int fra 1-12
            int timesDriven = Integer.parseInt(input[1]); // lagrer vores input som en int

            //Beregn godtgørelse med ternary if
            int moneyBack = (month <= 6) ? timesDriven * 60 : timesDriven * 80;

            totalCashBack += moneyBack; // Sætter totalCashBack til at være = sig selv + moneyBack
            System.out.println("Godtgørelse for " + months[month] + ":" + moneyBack + ",-"); //printer hvor meget tilbage i den givne måned.

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
