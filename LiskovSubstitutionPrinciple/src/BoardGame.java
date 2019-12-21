public class BoardGame {


    private final Roller diceRoller = new DoubleDiceRoller();

    public void movePlayer() {
        int numberRolled = diceRoller.rollDice();
        if (numberRolled < 3) {
            System.out.println("The player moves 1 spot");
        } else if (numberRolled > 3 && numberRolled <= 6) {
            System.out.println("The player moves 2 spots");
        } else {
            throw new RuntimeException("Unexpected Roll not within bounds:" + numberRolled);
        }
    }
}
