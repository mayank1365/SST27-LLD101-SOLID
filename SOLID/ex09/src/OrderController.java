public class OrderController {
    private final IOrderRepository repo;

    public OrderController(IOrderRepository repo) {
        this.repo = repo;
    }

    void create(String id) {
        repo.save(id);
        System.out.println("Created order: " + id);
    }
}
