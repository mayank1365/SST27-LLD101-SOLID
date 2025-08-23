public class OrderService {
    private Notifier notifier;

    double taxRate = 0.18;
    EmailClient email = new EmailClient();

    public OrderService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void placeOrder(String product) {
        System.out.println("Placing order for: " + product);
        notifier.send("Order Update", "Order placed for: " + product);
    }
}