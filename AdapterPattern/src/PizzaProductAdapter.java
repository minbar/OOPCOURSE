import pizzaapp.Pizza;
import store.Product;

public interface PizzaProductAdapter {

    Product transform(Pizza pizza);
}
