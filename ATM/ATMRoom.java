public class ATMRoom{

    ATM atm;
    User user;

    public static void main(){

        ATMRoom atmRoom = new ATMRoom();

        atmRoom.initialize();


        atmRoom.atm.printCurrentATMState();
        atmRoom.atm.getcurrentATMState().insertCard(atmRoom.atm , atmRoom.user.card);
        atmRoom.atm.getcurrentATMState().authenticatePIN(atmRoom.atm, atmRoom.user.card, 112211);
        atmRoom.atm.getcurrentATMState().selectOperation(atmRoom.atm,atmRoom.user.card,TransactionType.CASH_WITHDRAWL);
        atmRoom.atm.getcurrentATMState().cashWithdrawl(atmRoom.atm, atmRoom.user.card , 2700);
        atmRoom.atm.printCurrentATMState();

    }

    private void initialize(){

        atm = ATM.getATMObject();
        atm.setATMBalance(3500,1,2,5);

        this.user = createUser();
    }

    private User createUser(){

        User user = new User();
        user.setCard(createCard());

        return User;
        
    }

    private Card createCard(){
        Card card = new Card();
        card.setBankAccount(createUserBankAccount());
        return card;

    }

    private UserBankAccount createUserBankAccount(){
        UserBankAccount userBankAccount = new UserBankAccount();
        userBankAccount.balance = 3000;

        return userBankAccount;
    }

}