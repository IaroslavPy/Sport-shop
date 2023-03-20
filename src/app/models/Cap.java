package app.models;

public abstract class Cap implements Product {
    @Override
    public Producer produce() {
        return new CapProducer();
    }

    @Override
    public abstract double price();
}
