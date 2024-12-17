# To extend functionality we need to modify this peice of code, which contradics Open Close Principle;

public class PaymentsProcessor{

    public void processPayments(String paymentMethod , double amount){
        if(paymentMethod.equals('CreditCard')){
            System.out.println('Making payment via Credit card');
        }
        else if(paymentMethod.equals('debit card')){
            System.out.println("Making payment via Debit Card :" + amount);
        }
        else if(paymentMethod.equals("Paypal")) {
            System.out.println("Making payment via PayPal :" + amount);
        }
        else{
            throw new IllegalArgumentException("Unsupported payment method " +paymentMethod);
        }
    }

}