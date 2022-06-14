package after;

public class PhonePayClient {
    public static void main(String[] args){
        PhonePayAPI phone_pay_api = new PhonePayAPI(new YesBankAPIAdapter());// dependency-injection
        //when dependency-injection is done by framework it is called Inversion of Control.
        int payment_status = phone_pay_api.doPayment("1234", "5678", 78.98);
        String balance = phone_pay_api.viewBalance("2343433443989732", "john_vargese7092@oksbi");
        int beneficiary_status = phone_pay_api.addBeneficiary("Jeevan Pradeep", "8975032654", "HDFC", "HDFN008965");
        System.out.println("Payment Status: " + payment_status);
        System.out.println("Balance: " + balance);
        System.out.println("Beneficiary Status: " + beneficiary_status);
    }
}
