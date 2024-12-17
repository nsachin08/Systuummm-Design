
public class PaymentProcessor{

    public void processPayment(paymentMethod paymentMethod, double amount){
        paymentMethod.pay(amount)
    }
}