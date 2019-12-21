import model.*;

public class Main {

    public static void main(String args[]) {
        IceCream singleScoopIceCream = new SingleScoopIceCream();
        System.out.println("Price of single scoop ice cream: " + singleScoopIceCream.price());
        System.out.println("Price of double scoop ice cream: " +
                new DoubleScoopIceCream(singleScoopIceCream).price());
        System.out.println("Price of single scoop ice cream with chocolate: " +
                new ChocolateIceCream(singleScoopIceCream).price());
        System.out.println("Price of double scoop ice cream with gummybears: " +
                new GummyBearIceCream(new DoubleScoopIceCream(singleScoopIceCream)).price());
    }
}
