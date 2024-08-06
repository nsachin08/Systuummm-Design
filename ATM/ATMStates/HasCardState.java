public class HasCardState extends ATMState{

    public HasCardState(){
        System.out.println("Enter your card pin Number");
    }

    @Override
    public void authenticatePIN (ATM atm , Card card , int pin){
        boolean isCorrectPinEntered = card.isCorrectPinEntered(pin);

        if(isCorrectPinEntered){
            atm.setCurrentATMState(new SelectOperationState());
        }else{
            System.out.println("Invalid PIN Number");
            exit(atm);
        }
        
    }
}