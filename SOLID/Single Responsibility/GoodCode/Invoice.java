
public class Invoice {

    pprivate double amount;

    public Invoice(double amount){
        this.amount = amount;
    }

    //Additional Functionality
    public void generateInvoice(){
        System.out.println("Invoice generated & printed for amount " +amount);
    }

}