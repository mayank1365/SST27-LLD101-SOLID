// what is the recommended approach to inject
public class Demo04 {
    public static void main(String[] args) {
        Payment p = new Payment("UPI", 600);
        IPaymentService paymentService = new Upi();
        System.out.println(paymentService.pay(p));
    }
}
