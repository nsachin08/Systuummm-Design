
public class Invoice{

    private double amount;

    public Invoice (double amount){
        this.amount = amount;
    }

    // Additional Functionality
    public void generateInvoice (){
        System.out.println("Invoid Generated");
    }

    public void savetoDatabase(){
        System.out.println("Saved to Database");
    }

    public void sendEmailNotification(){
        System.out.println("Email Sent");
    }

}