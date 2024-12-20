
public class NotificationChannel{

    private NotificationService ns;

    public NotificationChannel(NotificationService ns)
    {
        this.ns = ns;
    }

    public void notify(String msg){
        ns.send(msg);
    }
}