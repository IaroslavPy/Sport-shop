package app;

import app.controller.OrderBuilder;
import app.model.Order;

public class App {
    public static void main(String[] args) {

        OrderBuilder orderBuilder = new OrderBuilder();

        Order orderA = orderBuilder.prepareOrderA();
        System.out.println("Order A: ");
        orderA.showProducts();
        System.out.println("Total cost: " + orderA.getCost() + "\n");

        Order orderB = orderBuilder.prepareOrderB();
        System.out.println("\nOrder B: ");
        orderB.showProducts();
        System.out.println("Total cost: " + orderB.getCost());
    }
}
