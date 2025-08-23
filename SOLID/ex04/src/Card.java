public class Card implements IPaymentService {

    @Override
    public String pay(Payment p) {
        return "Charged card: " + p.amount;
    }

}
