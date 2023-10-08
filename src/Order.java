public class Order {
    private final Item item;
    private final Quantity quantity;
    private final DealType type;

    public Order(Item item, Quantity quantity) {
        this(item, quantity, DealType.DEBIT);
    }

    public Order(Item item, Quantity quantity, DealType type){
        super();
        if(item == null){
            throw new IllegalArgumentException();
        }
        if(quantity == null){
            throw new IllegalArgumentException();
        }
        this.item = item;
        this.quantity = quantity;
        this.type = type;
    }

    public Order(Item item, Quantity quantity,QuantityLimit limit) throws LimitOverException{
        this(item,quantity);
        limit.check(this);
    }



    public Total getTotal(){
        ItemPrice price = this.item.getPrice().multi(quantity);
        return new Total(price.getAmount(),this.type);
    }

    public boolean isLessThan(Order target){
        if(this.item.equals(target.item) == false){
            return false;
        }
        return this.quantity.isLessThan(target.quantity);
    }

    public Order add(Order order) throws LimitOverException{
        if(this.item.equals(order.item) == false){
            throw  new IllegalArgumentException();
        }
        return OrderFactory.create(item,quantity.add(order.quantity));
    }

    public boolean isSameItem(Item item){
        return this.item.equals(item);
    }

}
