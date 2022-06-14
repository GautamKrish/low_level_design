package after;

public class YesBankAPIAdapter implements BankAPI{

    YesBankAPI yes_bank_api = new YesBankAPI();
    @Override
    public String doPayment(String payeeID, String paytoID, double amount) {
        String transaction_id =  yes_bank_api.makePayment(payeeID, paytoID, amount);
        return String.valueOf(checkPaymentStatus(transaction_id));
    }

    @Override
    public String checkBalance(String accountID, String upiID) {
        return yes_bank_api.checkBalance(accountID, upiID);
    }

    @Override
    public int addBeneficiary(String name, String bank, String ifsc, String accountNo) {
        return 0;
    }

    @Override
    public int checkPaymentStatus(String transaction_id) {
        return yes_bank_api.checkSuccess(transaction_id);
    }
}
