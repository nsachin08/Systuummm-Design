
public class SMSService implements NotificationService{

    @Override
    public void send(String msg){
        System.out.println("Sending SMS: "+ msg)
    }
}