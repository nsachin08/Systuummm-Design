public class Debitcard implements PaymentMethod{

    @override
    public void pay (double amount){
        System.out.println("Making Payment via Debit Card " + amount);
    }
}