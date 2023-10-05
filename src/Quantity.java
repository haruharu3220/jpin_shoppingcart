public class Quantity {
    private final int amount;

    public Quantity(int amount){
        super();
        if(amount <= 0 || 100 <= amount){
            throw new IllegalArgumentException();
        }
        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }
}
