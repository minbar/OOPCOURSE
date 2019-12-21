import java.util.List;

public class PizzaBuilder {

    private Pizza pizza;

    public PizzaBuilder(Dough dough, Mozarella mozarella) {
        this.pizza = new Pizza(dough, mozarella);
    }

    public PizzaBuilder withAnchiovi(Anchiovi anchiovi) {
        pizza.setAnchiovi(anchiovi);
        return this;
    }

    public PizzaBuilder withChicken(Chicken chicken) {
        pizza.setChicken(chicken);
        return this;
    }

    public PizzaBuilder withPickles(List<Pickle> pickles) {
        pizza.setPickles(pickles);
        return this;
    }

    Pizza build() {
        return pizza;
    }
}
