public class Demo01 {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailClient();
        OrderService orderService = new OrderService(emailNotifier);

        orderService.placeOrder("Laptop");
    }
}
