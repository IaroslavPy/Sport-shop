package app.controller;

import app.model.*;

public class OrderBuilder {

    public Order prepareOrderA(){
        Order order = new Order();
        order.addProduct(new RedTShirt());
        order.addProduct(new WhiteCap());
        return order;
    }

    public Order prepareOrderB(){
        Order order = new Order();
        order.addProduct(new BlueTShirt());
        order.addProduct(new BlackCap());
        return order;
    }
}
