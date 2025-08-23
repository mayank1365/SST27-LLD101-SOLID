public class Upi implements IPaymentService {

    @Override
    public String pay(Payment p) {
        return "Paid via UPI: " + p.amount;
    }

}
