import java.util.List;

public class ConservativePointGame extends Game {

    public ConservativePointGame(List<Player> players, int pointsToWin) {
        super(players, pointsToWin);
    }

    @Override
    protected int calculatePoints(int roll) {
        return roll > 3 ? 2 : 1;
    }
}
