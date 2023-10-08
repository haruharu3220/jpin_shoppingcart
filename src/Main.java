public class Main {
    public static void main(String[] args) throws Exception{

        Item apple = new Item(new ItemName("apple"),new ItemPrice(Currency.YEN,100));

        Item banana = new Item(new ItemName("banana"),new ItemPrice(Currency.YEN,80));

        ShoppingCart cart = new ShoppingCart();
        cart.add(new Order(apple, new Quantity(3)));
        cart.add(new Order(banana, new Quantity(5)));
        cart.add(new Order(apple, new Quantity(3),DealType.CREDIT));

        Total total = cart.getTotal();
        System.out.println(total.getAmount());

        }
    }
