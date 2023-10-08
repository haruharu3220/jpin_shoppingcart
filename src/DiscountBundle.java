import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DiscountBundle {
    private final Map<Item,Order> map = new HashMap<Item,Order>();
    private final Order discountReslt;

    public DiscountBundle(Order discountReslt, Item... items){
        for(Item item: items){
            map.put(item,null);
        }
        this.discountReslt =discountReslt;
    }

    public void bundle(Order order){
        Set<Item> keys = map.keySet();
        for(Item item : keys){
            if(order.isSameItem(item)){
                map.put(item, order);
                return;
            }
        }
    }

    public Order getDiscountOrder(){
        if(map.containsValue(null)){
            return null;
        }
        Set<Item> keys = map.keySet();
        for(Item key: keys){
            map.put(key, null);
        }
        return this.discountReslt;
    }
}
