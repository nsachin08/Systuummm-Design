
public class EmailService implements NotificationService{

    @Override
    public void send(String msg){
        System.out.println("Sending Email: "+ msg)
    }
}