import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        PizzaBuilder pizzaBuilder = new PizzaBuilder(new Dough(), new Mozarella());
        pizzaBuilder
                .withAnchiovi(new Anchiovi())
                .withPickles(Arrays.asList(new Pickle()));

        Pizza pizza = pizzaBuilder.build();




        System.out.println(pizza.toString());
    }
}
