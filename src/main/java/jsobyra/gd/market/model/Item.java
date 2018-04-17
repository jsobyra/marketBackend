package jsobyra.gd.market.model;

public class Item {
    private final int id;
    private String title;
    private int available;
    private double price;

    public Item(int id, String title, int available, double price) {
        this.id = id;
        this.title = title;
        this.available = available;
        this.price = price;
    }
}
