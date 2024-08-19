import util.FileIO;
import util.TextUI;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private String name;
    private List<Item> itemList;
    private String path;
    private FileIO io = new FileIO();
    private TextUI ui = new TextUI();

    // Constructor
    public TodoList(String name, String path) {
        this.name = name;
        itemList = new ArrayList<>();
        this.path = path;
        this.parseTodoListData();
    }

    // Framework for setting up the CSV file
    public Item createTodoListFromString(String todoString) {
        String[] todoParts = todoString.split(",");
        String description = todoParts[0];
        boolean isDone = todoParts[1].trim().equalsIgnoreCase("Done"); // Sets the boolean value isDone equals to the string "Done" and adds it to index 1 in the array

        return new Item(description, isDone);
    }

    // Parsing our data from the program, and into the csv file.
    public void parseTodoListData() {
        ArrayList<String> itemsList = io.readData(path);        // Making our arrayList = our readData method from FileIO
        for (String lineData : itemsList) {                     // Running through our list, which is now reading from our file.
            Item item = createTodoListFromString(lineData);     // Making new Item objects
            itemList.add(item);                                 // Adding the item to our list, that is instantiated in our constructor
        }
    }


    public void displayList() {
        int count = 1;                                          // Making the "1" label of our todolist
        for (Item item : itemList) {
            System.out.println(count + ": " + item);
            count++;                                            // Increments our int count with 1
        }
    }

    // The main program that branches out to different methods starting new dialogs.
    public void runDialog() {
        ArrayList<String> optionList = new ArrayList<>();
        optionList.add("Tilføj til todo listen");
        optionList.add("Fjern fra todo listen");
        optionList.add("Vis Todo listen");
        optionList.add("Luk program");
        ui.displayMsg("To do Liste");
        boolean proceed = true;
        while (proceed) {       // Making a loop for our switch case, making it run until proceed = false, which is happening in case 4
            int choice = ui.promptChoice(optionList, "Vælg en handling");
            switch (choice) {
                case 1:
                    ui.displayMsg("Tilføj til todo listen");
                    addToToDoDialog();
                    saveUserData();
                    break;
                case 2:
                    ui.displayMsg("Fjern fra todo listen");
                    removeFromToDoDialog();
                    saveUserData();
                    break;
                case 3:
                    ui.displayMsg("Vis Todo listen");
                    toDoOptionDialog();
                    saveUserData();
                    break;
                case 4:
                    ui.displayMsg("Ha' det som du ser ud!");
                    saveUserData();
                    proceed = false;
                    break;
            }
        }
    }

    // Method that adds the users choice to the todoList
    public void addToToDoDialog() {

        if (itemList.size() < 21) {
            String choice = ui.promptText("Hvad vil du tilføje til listen?");
            this.itemList.add(new Item(choice, false));
            ui.displayMsg("Tilføjet til to do listen");
        } else {
            ui.displayMsg("Det kan du ikke.");
        }

    }

    // Method that displays our list and gives the user the option to remove things from the list
    public void removeFromToDoDialog() {
        displayList();
        int choice = ui.promptNumeric("Hvad vil du fjerne fra listen?", itemList.size()); //Gives a message and sets a boundary for the users choice
        itemList.remove(choice - 1);
        ui.displayMsg(itemList.get(choice - 1).getDescription() + " blev fjernet fra listen");
    }

    // Method that displays our list, and gives the user the option to cross items out + removing items if they're already done.
    public void toDoOptionDialog() {
        displayList();
        boolean choice = ui.promptBinary("Vil du krydse noget af listen? Y/N", "Y", "N");  //If accept do something, else do something else
        if (choice) {   // Our accept dialog
            int choiceY = ui.promptNumeric("Hvad vil du krydse af listen?", itemList.size());
            Item chosenItem = itemList.get(choiceY - 1);
            // If statement that removes the item from the list, if it is already done. If not, it sets it to done.
            if (chosenItem.isDone()) {
                itemList.remove(choiceY - 1);
            } else {
                chosenItem.setDone(true);
            }
            ui.displayMsg(chosenItem.getDescription() + " blev krydset af listen");
        } // Our reject dialog is to do nothing, hence below.
        // Do nothing, ie return to runDialog
    }

    // Save data method that take three parameters. Header that must match the csv file, a List of data, and a path.
    private void saveUserData() {
        io.saveData("Description, Done", new ArrayList<>(itemList), path);
    }

}

