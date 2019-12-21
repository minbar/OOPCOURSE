import pizzaapp.Ingredient;
import pizzaapp.Pizza;
import store.Product;
import store.ProductType;
import store.Size;

import java.util.List;
import java.util.stream.Collectors;

public class PizzaProductAdapterImpl implements PizzaProductAdapter {

    @Override
    public Product transform(Pizza pizza) {
        List<String> ingredients = pizza.getIngredients().stream()
                .map(Ingredient::getName)
                .collect(Collectors.toList());

        return new Product(pizza.getName(), pizza.getDesc(),
                new Size(0, pizza.getCircumference(), 0),
                ProductType.FOOD, pizza.getPrice(), ingredients);
    }
}
