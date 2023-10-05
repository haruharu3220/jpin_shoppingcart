public class Total {
    private final int amount; //価格
    public Total(int amount){
        if(amount < 0 ){
            throw new IllegalArgumentException();
        }
        if(100000 < amount ){
            throw new IllegalArgumentException();
        }
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public Total add(Total target){
        return new Total(amount + target.amount);
    }
}
