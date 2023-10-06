import java.time.LocalDate;

public class QuantityLimit {
    private Order limit;
    private  QuantityLimit next;
    private LocalDate start;
    private LocalDate end;

    public QuantityLimit(Item item, Quantity limit) {
        this.limit = new Order(item,limit);
    }
    public QuantityLimit setNext(QuantityLimit next){
        this.next = next;
        return next;
    }

    public void check(Order target) throws LimitOverException{
        if(limit.isLessThan(target)){
            throw new LimitOverException();
        }
        if(this.next !=null){
            this.next.check(target);
        }
    }

}
