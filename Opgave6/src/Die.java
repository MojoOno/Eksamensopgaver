import java.util.Random;

public class Die {
    private int sides;
    private Random random = new Random();

    // Constructor
    public Die (int sides){
        this.sides = sides;
    }

    // Method that gives os a random number from 1 - sides
    public int throwDie(){
        return random.nextInt(sides) + 1;
    }

    public int getSides() {
        return sides;
    }
}
