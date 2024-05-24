public class Main {

    public static void main(String[] args) {
        TodoList todo = new TodoList("data/todo.csv");      // Instantiate a new todolist object with our path as parameter

        todo.runDialog();                                       // Runs the program
    }
}