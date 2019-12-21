package pizzaapp;

import java.util.List;

public class Pizza {

    private final String name;
    private final String desc;
    private final int price;
    private int circumference;
    private final List<Ingredient> ingredients;

    public Pizza(String name, String desc, int price, int circumference, List<Ingredient> ingredients) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.circumference = circumference;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getPrice() {
        return price;
    }

    public int getCircumference() {
        return circumference;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }
}
