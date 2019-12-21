public class Player {

    private final String name;
    private int points = 0;


    public Player(String name) {
        this.name = name;
    }

    public void addPoints(int newPoints) {
        points+=newPoints;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }
}
