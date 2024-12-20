class Main{

    public static void main(String[] args){
        NotificationChannel nc = new NotificationChannel(new EmailService());
        nc.notify("Your order has been placed");

        
    }
}