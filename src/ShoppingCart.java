import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Order> orders;
    private DiscountBundle discount;
    public ShoppingCart(){

        this.orders = new ArrayList<Order>();
        this.discount = DiscountBundleFactory.create();
    }

    public void add(Order order){

        this.orders.add(order);

        discount.bundle(order);
        Order result = discount.getDiscountOrder();
        if(discount.getDiscountOrder() != null){
            this.orders.add(result);
        }
    }

    public Total getTotal() {
        Total total = new Total(0);
        for (Order order : orders) {
            total = order.getTotal().add(total);
        }
        return total;
    }
}
