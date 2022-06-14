package after;

public interface BankAPI {

    String doPayment(String payeeID, String paytoID, double amount);
    String checkBalance(String accountID, String upiID);
    int addBeneficiary(String name, String bank, String ifsc, String accountNo);
    int checkPaymentStatus(String transaction_id);
}
