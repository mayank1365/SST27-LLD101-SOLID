public class Wallet implements IPaymentService {

    @Override
    public String pay(Payment p) {
        return "Wallet debited: " + p.amount;
    }

}
