package model;

public class DoubleScoopIceCream implements IceCream {

    private final IceCream iceCream;

    public DoubleScoopIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double price() {
        return iceCream.price() + 1;
    }
}
