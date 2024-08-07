public class Card{

    private int cardNumber;
    private int cvv;
    private int expiryDate;
    private int holderName;

    static int PIN_NUMBER = 112211;

    //BankAccount

    public boolean isCorrectPINentered(int pin){
        if(pin == PIN_NUMBER){
            return true;
        }

        return false;
    }

    public int getBankBalance(){
        return ;
    }

    public void deductBankBalance(){

    }

    public void setBankAccount(){
        
    }

}