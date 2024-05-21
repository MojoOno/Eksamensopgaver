import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {
    public ArrayList<Item> loadFile(String path) {
        ArrayList<Item> itemsList = new ArrayList<>();
        File file = new File(path);

        if (!file.exists()) {
            System.out.println("File not found");
            return itemsList;
        }

        try {
            Scanner scan = new Scanner(file);
            scan.nextLine(); // SKIP HEADER

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] todoParts = line.split(","); // Instantiates an array of String

                String description = todoParts[0]; // sets description to spot [0] (first spot) in the array
                boolean isDone = Boolean.parseBoolean(todoParts[1].trim()); // sets isDone to spot [1] (second spot) in the array

                Item item = new Item(description, isDone); // making a new Items object
                itemsList.add(item); // Adds the item to our list of Items

            }

            scan.close(); // closing the scanner

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return itemsList;
    }
}
