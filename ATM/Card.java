public class Card{

    private int cardNumber;
    private int cvv;
    private int expiryDate;
    private int holderName;

    static int PIN_NUMBER = 112211;

    //BankAccount
    private UserBankAccount bankAccount;

    public boolean isCorrectPINentered(int pin){
        if(pin == PIN_NUMBER){
            return true;
        }

        return false;
    }

    public int getBankBalance(){
        return BankAccount.balance;
    }

    public void deductBankBalance(int amt){
            BankAccount.deductBankBalance(amt);
    }

    public void setBankAccount(UserBankAccount UserBankAccount){
        this.bankAccount = UserBankAccount;
    }

}