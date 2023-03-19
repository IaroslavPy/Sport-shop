package app.model;

public class RedTShirt extends TShirt{
    @Override
    public String name() {
        return "T-shirt red";
    }

    @Override
    public double price() {
        return 120.50D;
    }
}
