package app;

import app.controller.OrderBuilder;
import app.models.Order;
import app.view.ProductView;

public class App {
    public static void main(String[] args) {
        System.out.println("Deleted");

        OrderBuilder orderBuilder = new OrderBuilder();
        ProductView viewOrder = new ProductView();

        Order orderA = orderBuilder.prepareOrderA();
        System.out.println("Order A: ");
        viewOrder.showProducts(orderA.products);
        System.out.println("Total cost: " + orderA.getCost() + "\n");

        Order orderB = orderBuilder.prepareOrderB();
        System.out.println("\nOrder B: ");
        viewOrder.showProducts(orderB.products);
        System.out.println("Total cost: " + orderB.getCost());
    }
}
