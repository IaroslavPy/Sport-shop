package app.view;

import app.models.Product;

import java.util.List;

public class ProductView {

    public void showProducts(List<Product> products) {
        for (Product product : products) {
            System.out.println("Product name: " + product.name());
            System.out.println("Producer: " + product.produce().producer());
            System.out.println("Price: " + product.price() + "\n");
        }
    }
}
