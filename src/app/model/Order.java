package app.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

    List<Product> products = new ArrayList<>();

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

    public void showProducts(){
        for (Product product: products) {
            System.out.println("Product name: " + product.name());
            System.out.println("Producer: " + product.produce().producer());
            System.out.println("Price: " + product.price() + "\n");
        }
    }
}
