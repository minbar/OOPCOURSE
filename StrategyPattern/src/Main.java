import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Player> players = List.of(new Player("Mindaugas"), new Player("Mike"));
        Game game = new AgressivePointsGame(players, 10);
        game.play();
    }
}
