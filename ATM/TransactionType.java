public enum TransactionType{

    CASH_WITHDRAWL;
    BALANCE_CHECK;

    public static void showAllTransactionTypes(){
        for(TransactionType type :  TransactionType.values()){
            System.out.println(type);
        }
    }
}