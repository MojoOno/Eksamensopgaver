import java.util.ArrayList;
import java.util.List;

public class TodoList {
    public List<Item> itemList;

    public TodoList(ArrayList<Item> itemList) {
        this.itemList = itemList;


    }

    public void displayList() {
        int count = 1;
        for (Item item : itemList) {
            System.out.println(count + ": " + item);
            count++;
        }
    }
}
