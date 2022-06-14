package before;

public class PhonePayAPI {
    YesBankAPI yes_bank_api = new YesBankAPI();

    public double viewBalance(String accountID, String upiID){
        return yes_bank_api.checkBalance(accountID, upiID);
    }

    public int doPayment(String payeeID, String paytoID, double amount){
        String payment =  yes_bank_api.makePayment(payeeID, paytoID, amount);
        return yes_bank_api.checkSuccess(payment);

    }
}
