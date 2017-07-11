package TestDefinitions;

/**
 * Created by dell on 11.7.2017 г..
 */
public class Item {
    String name;
    int price = 0;
    int count = 0;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
        this.count = 0;
    }
}
