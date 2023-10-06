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
    public boolean isLessThan(Quantity target){
        return this.amount < target.amount;
    }

    public  Quantity add(Quantity quantity){
        return new Quantity(this.amount + quantity.amount);
    }
}
