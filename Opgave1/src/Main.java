public class Main {

    public static void main(String[] args) {
        TodoList todo = new TodoList("data/todo.csv");

        todo.runDialog();
    }
}