
public class ATM{

    private static ATM atmObject = new ATM();

    ATMState currentATMState;

    private int atmBalance;
    int noOfTwoThousandNotes;
    int noOfFiveHundredNotes;
    int noOfOneHundredNotes;

    private ATM(){

    }

    public void setCurrentATMState(ATMState currentATMState){
            this.currentATMState = currentATMState;
    }

    public ATMState getcurrentATMState(){
        return this.currentATMState;
    }

    public static ATM getATMObject(){
        atmObject.setCurrentATMState(new IdleState());
        return atmObject;
    }

    public int getATMBalance(){
        return atmBalance;
    }

    public void setATMBalance(int atmBalance , int noOfTwoThousandNotes, int noOfFiveHundredNotes, int noOfOneHundredNotes){
        this.atmBalance = atmBalance;
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public int getNoOfTwoThousandNotes(){
        return this.noOfTwoThousandNotes;
    }

    public int getNoOfFiveHundredNotes(){
        return this.noOfFiveHundredNotes;
    }

    public int getNoOneHundredNotes(){
        return this.noOfOneHundredNotes;
    }

    public void deductATMbalance(int amount){
        atmBalance = atmBalance - amount;
    }

    public void deductTwoThousandNotes(int number){
        noOfTwoThousandNotes = noOfTwoThousandNotes - number;
    }

    public void deductFiveHundredNotes(int number){
        noOfFiveHundredNotes = noOfFiveHundredNotes - number;
    }
    public void deductOneHundredNotes(int number){
        noOfOneHundredNotes = noOfOneHundredNotes - number;
    }

    public void printCurrentATMState(){

        System.out.println("Balance: " + atmBalance);
        System.out.println("2k Notes: " + noOfTwoThousandNotes);
        System.out.println("500 Notes: " + noOfFiveHundredNotes);
        System.out.println("100 Notes: " + noOfOneHundredNotes);
    }

}