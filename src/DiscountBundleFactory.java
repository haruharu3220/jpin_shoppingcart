public class DiscountBundleFactory {
    public static DiscountBundle create(){
        Order result = new Order(
                new Item(
                        new ItemName("discount"),
                        new ItemPrice(Currency.YEN,18)
                ),
                new Quantity(1),
                DealType.CREDIT
        );
        DiscountBundle bundle = new DiscountBundle(result,new Item(
                    new ItemName("apple"),
                    new ItemPrice(Currency.YEN,100)),
                new Item(
                    new ItemName("banana"),
                    new ItemPrice(Currency.YEN,80))
        );
        return bundle;
    }
}
