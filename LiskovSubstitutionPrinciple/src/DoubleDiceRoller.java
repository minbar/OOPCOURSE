public class DoubleDiceRoller extends DiceRoller {

    @Override
    public int rollDice() {
        return super.rollDice() + super.rollDice();
    }
}
