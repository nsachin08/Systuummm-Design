public class CreditCard extends PaymentMethod{
    @override
    public void pay(double amount){
        System.out.println("Making Payment via Credit Card" + amount);
    }
}