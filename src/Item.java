import java.util.Objects;

public class Item {
    private final ItemName name;
    private final ItemPrice price;

    public Item(ItemName name , ItemPrice price){
        super();
        if(name == null || price == null){
            throw  new IllegalArgumentException();
        }

        this.name = name;
        this.price = price;
    }

    public ItemPrice getPrice() {
        return price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name) && Objects.equals(price, item.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
