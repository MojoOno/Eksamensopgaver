import util.FileIO;
import util.TextUI;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    public List<Item> itemList;
    String path;
    FileIO io = new FileIO();
    TextUI ui = new TextUI();
    //Item item = new Item();

    public TodoList(String path) {
        itemList = new ArrayList<>();
        this.path = path;
        this.parseTodoListData();
    }

    public Item createTodoListFromString(String todoString) {
        String[] todoParts = todoString.split(",");
        String description = todoParts[0];
        boolean isDone = todoParts[1].trim().equalsIgnoreCase("Done");

        return new Item(description, isDone);
    }

    public void parseTodoListData() {
        ArrayList<String> itemsList = io.readData(path);
        for (String description : itemsList) {
            Item item = createTodoListFromString(description);
            itemList.add(item);
        }
    }

    public void displayList() {
        int count = 1;
        for (Item item : itemList) {
            System.out.println(count + ": " + item);
            count++;
        }
    }

    public void runDialog() {
        ArrayList<String> optionList = new ArrayList<>();
        optionList.add("Tilføj til todo listen");
        optionList.add("Fjern fra todo listen");
        optionList.add("Vis Todo listen");
        optionList.add("Luk program");
        ui.displayMsg("To do Liste");
        boolean proceed = true;
        while (proceed) {
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

    public void addToToDoDialog() {
        String choice = ui.promptText("Hvad vil du tilføje til listen?");
        this.itemList.add(new Item(choice, false));
        ui.displayMsg("Tilføjet til to do listen");
    }

    public void removeFromToDoDialog() {
        displayList();
        int choice = ui.promptNumeric("Hvad vil du fjerne fra listen?", itemList.size());
        itemList.remove(choice - 1);
        ui.displayMsg(itemList.get(choice - 1).getDescription() + " blev fjernet fra listen");
    }

    public void toDoOptionDialog() {
        displayList();
        boolean choice = ui.promptBinary("Vil du krydse noget af listen? Y/N", "Y", "N");
        if (choice) {
            int choiceY = ui.promptNumeric("Hvad vil du krydse af listen?", itemList.size());
            Item chosenItem = itemList.get(choiceY - 1);

            if (chosenItem.isDone()) {
                itemList.remove(choiceY - 1);
            } else {
                chosenItem.setDone(true);
            }

            ui.displayMsg(chosenItem.getDescription() + " blev krydset af listen");
        } else {
            // Do nothing, ie return to runDialog
        }
    }

    private void saveUserData() {
        io.saveData("Description, Done", new ArrayList<>(itemList), path);
    }

}
