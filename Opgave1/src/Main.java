

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FileIO io = new FileIO();
        String path = "data/todo.csv";
        ArrayList<Item> items = io.loadFile(path);
        TodoList todo = new TodoList(items);

        todo.displayList();




    }
}