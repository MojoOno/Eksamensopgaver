public class Main {

    public static void main(String[] args) {
        TodoList todo = new TodoList("Work","data/todo.csv");// Instantiate a new todolist object with our path as parameter
        TodoList todo1 = new TodoList("Fritid","data/todo.csv");

        String currenList = "work";

        if(currenList.equalsIgnoreCase("work")){
            todo.runDialog();
        }
            todo1.runDialog();


                                               // Runs the program
    }
}