public class Demo09 {
    public static void main(String[] args) {
        IOrderRepository repo = new SqlOrderRepository(); // choose implementation
        OrderController controller = new OrderController(repo); // inject it
        controller.create("ORD-1");
    }
}
