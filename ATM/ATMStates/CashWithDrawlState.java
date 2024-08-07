public class CashWithdrawlState extends ATMState{

    public CashWithdrawlState(){

        System.out.println("Please enter the Withdrawl Amount");
    }

    public void cashWithdrawl(ATM atmObject , Card card , int withdrawlAmountRequest){
        if(atmObject.getAtmBalance() < withdrawlAmountRequest){
            System.out.println("Insufficient fund in the ATM Machine");
            exit(atmObject);
        }else if(cardBankBalance() < withdrawlAmountRequest){
            System.out.println("Insufficient fund in your bank Account");
        }
        else{
            card.deductBankBalance(withdrawlAmountRequest);
            atmObject.deductATMBalance(withdrawlAmountRequest);

            // Withdrawl Chain of Resposibility implementation;s

            CashWithdrawlProcessor cashWithdrawlProcessor = new TwoThousandWithdrawlProcessor(new FiveHundredWithdrawlProcessor(new OneHundredWithdrwalProcessor(null))) ;

            cashWithdrawlProcessor.withdrawl(atmObject, withdrawlAmountRequest);
            exit(atmObject);
        }
    }

    @Override
    public void exit(ATM atmObject){
        returnCard();
        atmObject.setCurrentATMState(new IdleState());
        System.out.println("Exit Happens");
    }

    @Override
    public void returnCard(){
        System.out.println("Please collect your card");
    }
} 