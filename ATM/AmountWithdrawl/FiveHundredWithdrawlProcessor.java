public class FiveHundredWithdrawlProcessor extends CashWithDrawlProcessor{

    public FiveHundredWithdrawlProcessor(CashWithDrawlProcessor CashWithDrawlProcessor){
        super(CashWithDrawlProcessor);
    }

    @Override
    void withdraw(Atm atm, int remainingAmount){

        int required = remainingAmount /500;
        int balance = remainingAmount %500;

        if(required < atm.getNoofFiveHundredNotes()){
            atm.deductFiveHundredNotes(required);
        }
        else if(required > atm.getNoofFiveHundredNotes()){
            atm.deductFiveHundredNotes(atm.deductFiveHundredNotes());
            balance = balance + (required-atm.deductFiveHundredNotes())*500;
        }

        if(balance !=0 ){
            super.withdraw(atm, balance);
        }
    }

}