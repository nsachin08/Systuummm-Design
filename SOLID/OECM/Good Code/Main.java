
public class Main{

    public static void main(){
        PaymentProcessor paymentProcessor = new paymentProcessor();
        PaymentMethod creditCard = new creditCard();
        PaymentMetohd upi = new UPI();

        paymentProcessor.pay(creditCard,50);
        paymentProcessor.pay(upi,30);
    }
}