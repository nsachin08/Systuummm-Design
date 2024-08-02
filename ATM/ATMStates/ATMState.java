package ATMStates;

import javax.smartcardio.Card;

public abstract class ATMState {
    public void insertCard(ATM atm , Card card){
        System.out.println("Oops!! Something went wrong");
    }

    public void authenticatePIN(ATM atm , Card card , int pin){
        System.out.println("Oops!! Something went wrong");
    }

    public void selectOperation(ATM atm , Card card , TransactionType txntype){
        System.out.println("Oops!! Something went wrong");
    }

    public void cashWithdrawl(ATM atm, Card card, int withdrawlAmount){
        System.out.println("Oops!! Something went wrong");
    }

    public void displayBalance(ATM atm, Card card){
        System.out.println("Oops!! Something went wrong");
    }

    public void returnCard(){
        System.out.println("Oops!! Something went wrong");
    }

    public void exit(ATM atm){
        System.out.println("Oops!! Something went wrong");
    }


}
