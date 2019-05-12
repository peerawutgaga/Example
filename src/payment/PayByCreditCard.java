package payment;

public class PayByCreditCard implements PaymentType{
    @Override
    public void pay() {

    }
    public boolean pay(String studentID, String cvc){
        return false;
    }
}
