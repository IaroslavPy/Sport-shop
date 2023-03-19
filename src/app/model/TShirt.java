package app.model;

public abstract class TShirt implements Product{
    @Override
    public Producer produce() {
        return new TShirtProducer();
    }

    @Override
    public abstract double price();
}
