import pizzaapp.Ingredient;
import pizzaapp.Pizza;
import store.Product;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza("pepperoni",
                "the best pizza with pepperoni",
                10, 30,
                Arrays.asList(new Ingredient("pepperoni", "200 grams"),
                                new Ingredient("dough", "500 grams"),
                                new Ingredient("mozarella", "300 grams")));

                PizzaProductAdapter pizzaProductAdapter = new PizzaProductAdapterImpl();
        Product product = pizzaProductAdapter.transform(pizza);


    }
}
