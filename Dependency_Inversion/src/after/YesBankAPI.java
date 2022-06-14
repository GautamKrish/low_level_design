package after;

public class YesBankAPI {
    public String checkBalance(String accountID, String upiID) {
        return "12.07";
    }

    public String makePayment(String payeeID, String paytoID, double amount) {
        return "178@fghasd";
    }

    public int checkSuccess(String transaction_id) {
        return 1;
    }

}
