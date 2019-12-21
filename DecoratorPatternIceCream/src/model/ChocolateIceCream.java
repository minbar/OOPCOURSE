package model;

public class ChocolateIceCream implements IceCream {

    private final IceCream iceCream;

    public ChocolateIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double price() {
        return iceCream.price() + 0.3;
    }
}
