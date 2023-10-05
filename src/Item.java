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
}
