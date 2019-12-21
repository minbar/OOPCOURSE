package model;

public class GummyBearIceCream implements IceCream {

    private final IceCream iceCream;

    public GummyBearIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double price() {
        return iceCream.price() + 0.6;
    }
}
