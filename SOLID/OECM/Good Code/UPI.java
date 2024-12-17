
public class UPI implements PaymentMethod{

    @override
    public void pay (double amount){
        System.out.println("Making payment via UPI " +amount);
    }
}