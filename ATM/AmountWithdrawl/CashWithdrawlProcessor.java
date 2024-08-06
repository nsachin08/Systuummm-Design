
public abstract class CashWithdrawlProcessor {

    CashWithdrawlProcessor nextCashWithdrawlProcessor;

    CashWithdrawlProcessor (CashWithdrawlProcessor CashWithdrawlProcessor){
        this.nextCashWithdrawlProcessor = CashWithdrawlProcessor;
    }

    public void withdraw(ATM atm, int remainingAmount){

        if(nextCashWithdrawlProcessor != null){
            nextCashWithdrawlProcessor.withdraw(atm,remainingAmount);
        }
    }

}