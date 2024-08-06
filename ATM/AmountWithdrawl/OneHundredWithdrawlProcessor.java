public class OneHundredWithdrawlProcessor extends CashWithDrawlProcessor{

    OneHundredWithdrawlProcessor (CashWithDrawlProcessor nextCashWithdrawlProcessor){
        super(nextCashWithdrawlProcessor);
    }

    @Override
    public void withdraw(Atm atm , int remainingAmount){
        int required = remainingAmount /100;
        int balance = remainingAmount %100;

        if(required <= atm.getNoOfOneHundredNotes()){
            atm.deductOneHundredNotes(required);
        }
        else if(required > atm.getNoOfOneHundredNotes()){
            atm.deductOneHundredNotes(atm.getNoOfOneHundredNotes());
            balance = balance + (required-atm.getNoOfOneHundredNotes())*100;
        }

        if(balance !=0 ){
            System.out.println("Something Went Wrong");
        }
    }
}