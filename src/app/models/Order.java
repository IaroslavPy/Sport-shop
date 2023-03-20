package app.models;

import java.util.ArrayList;
import java.util.List;

public class Order {

    public List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getCost() {
        double cost = 0.00D;
        for (Product product : products) {
            cost = cost + product.price();
        }
        return cost;
    }
}
