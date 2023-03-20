package app.models;

public class BlueTShirt extends TShirt {
    @Override
    public String name() {
        return "T-shirt blue";
    }

    @Override
    public double price() {
        return 100.00D;
    }
}
