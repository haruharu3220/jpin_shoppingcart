import java.util.Objects;

public class ItemPrice {
    private final Currency currency;
    private final int amount;


    public ItemPrice(Currency currency,int amount) {
        super();

        if(currency == null){
            throw new IllegalArgumentException();
        }

        if(amount < 0 ){
            throw  new IllegalArgumentException();
        }

        if(100000 < amount ){
            throw  new IllegalArgumentException();
        }
        this.currency = currency;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public ItemPrice multi(Quantity qty){
        return new ItemPrice(currency,amount* qty.getAmount());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPrice itemPrice = (ItemPrice) o;
        return amount == itemPrice.amount && currency == itemPrice.currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, amount);
    }
}
