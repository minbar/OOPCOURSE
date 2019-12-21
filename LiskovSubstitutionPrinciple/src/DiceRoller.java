import java.util.Random;

public class DiceRoller implements Roller {

    protected final Random random = new Random();

    public int rollDice() {
        return random.nextInt()%5 + 1;
    }
}
