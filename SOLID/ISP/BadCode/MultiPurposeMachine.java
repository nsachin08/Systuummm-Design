public class MultiPurposeMachine implements Machine{

    @Override 
    public void print(Document doc){
        System.out.println("Printing document...");
    }

    @Override 
    public void scan(Document doc){
        System.out.println("Scanning document...");
    }

    @Override 
    public void copy(Document doc){
        System.out.println("Copying document...");
    }
}