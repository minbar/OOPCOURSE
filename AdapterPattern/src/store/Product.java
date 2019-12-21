package store;

import java.util.List;

public class Product {

    private final String name;
    private final String description;
    private final Size size;
    private final ProductType productType;
    private final double price;
    private final List<String> ingredients;

    public Product(String name, String description, Size size, ProductType productType,
                   double price, List<String> ingredients) {
        this.name = name;
        this.description = description;
        this.size = size;
        this.productType = productType;
        this.price = price;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public ProductType getProductType() {
        return productType;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}

