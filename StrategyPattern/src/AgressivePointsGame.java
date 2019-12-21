import java.util.List;

public class AgressivePointsGame extends Game {

    public AgressivePointsGame(List<Player> players, int pointsToWin) {
        super(players, pointsToWin);
    }

    @Override
    protected int calculatePoints(int roll) {
        if (roll > 5) {
            return 5;
        }

        if (roll > 3) {
            return 2;
        }

        return 1;
    }
}
