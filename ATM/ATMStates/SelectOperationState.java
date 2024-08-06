public class SelectOperationState extends ATMState{

    public SelectOperationState(){
        showOperations();
    }

    @Override
    public void selectOperation(ATM atmObject , Card card , TransactionType txnType){

        switch(txnType){

            case CASH_WITHDRAWL :
                atmObject.setCurrentATMState(new CashWithdrawlState());

            case BALANCE_CHECK:
                atmObject.setCurrentATMState(new CheckBalanceState());
            
            default:
                System.out.println("Invalid Option");
                exit(atmObject);
        }

    }

    @Override
    public void exit(ATM atmObject){
        returnCard();
        atmObject.setCurrentATMState(new IdleState());
        System.out.println("Exit Happens");
    }

    private void showOperations(){
        System.out.println("Please select the Operation");
        TransactionType.showAllTransactionTypes();
    }
}