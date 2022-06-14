package after;

public class PhonePayAPI {

    BankAPI bank_api; //= new YesBankAPIAdapter();
    //PhonePay's own set of apis' (own api signature)
    PhonePayAPI(BankAPI bank_api){
        this.bank_api = bank_api;
    }
    public String viewBalance(String accountID, String upiID){
        return bank_api.checkBalance(accountID, upiID);
    }

    public int doPayment(String payeeID, String paytoID, double amount){
        String paymentID =  bank_api.doPayment(payeeID, paytoID, amount);
        return bank_api.checkPaymentStatus(paymentID);
    }
    public int addBeneficiary(String name, String beneficiary_account_number, String beneficiary_bank, String beneficiary_bank_ifsc){
        return bank_api.addBeneficiary(name, beneficiary_account_number, beneficiary_bank, beneficiary_bank_ifsc);
    }

}
