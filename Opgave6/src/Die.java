import java.util.Random;

public class Die {
    int sides;
    Random random = new Random();

    // Constructor
    public Die (int sides){
        this.sides = sides;
    }

    public int throwDie(){
        return random.nextInt(sides) + 1;
    }

    public int getSides() {
        return sides;
    }
}
