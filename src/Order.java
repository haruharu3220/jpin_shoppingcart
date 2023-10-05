public class Order {
    private final Item item;
    private final Quantity quantity;

    public Order(Item item, Quantity quantity) {
        super();
        if(item == null){
            throw new IllegalArgumentException();
        }
        if(quantity == null){
            throw new IllegalArgumentException();
        }
        this.item = item;
        this.quantity = quantity;
    }

    public Total getTotal(){
        ItemPrice price = this.item.getPrice().multi(quantity);
        return new Total(price.getAmount());

    }
}
