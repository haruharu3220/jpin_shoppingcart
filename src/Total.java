public class Total {
    private final int amount; //価格
    private final DealType type;
    public Total(int amount){
        this(amount, DealType.DEBIT);
    }

    public Total(int amount, DealType type){
        if(amount < 0 ){
            throw new IllegalArgumentException();
        }
        if(100000 < amount ){
            throw new IllegalArgumentException();
        }
        this.amount = amount;
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }


    public boolean isCredit(){
        return this.type == DealType.CREDIT;
    }


    public Total add(Total target){
        //自分自身もターゲットもマイナスの場合
        if(this.isCredit() && target.isCredit()){
            return new Total(amount + target.amount, DealType.CREDIT);
        }

        if(this.isCredit()){
            return new Total(target.amount - amount, DealType.DEBIT);
        }

        if(target.isCredit()){
            return new Total(amount - target.amount, DealType.DEBIT);
        }

        return new Total(amount + target.amount);
    }
}
