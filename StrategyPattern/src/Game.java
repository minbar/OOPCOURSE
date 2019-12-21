import java.util.List;
import java.util.Optional;
import java.util.Random;

public abstract class Game {

    private Random random = new Random();
    private final List<Player> players;
    private final int pointsToWin;

    public Game(List<Player> players, int pointsToWin) {
        this.players = players;
        this.pointsToWin = pointsToWin;
    }

    public void play() {
                while (true) {
                    players.forEach(player -> {
                        int rolledPoints = calculatePoints(rollDice());
                        System.out.println("player " + player.getName() + " got " + rolledPoints + " points");
                        player.addPoints(rolledPoints);
                    });

                    Optional<Player> winner = players.stream()
                            .filter(player -> player.getPoints() >= pointsToWin)
                            .findFirst();

                    if (winner.isPresent()) {
                        System.out.println("player " + winner.get().getName() +
                                " won the game with " + winner.get().getPoints() + " points");
                        return;
                    }
        }
    }

    protected abstract int calculatePoints(int roll);

    private int rollDice() {
        return random.nextInt()%6 + 1;
    }


}
