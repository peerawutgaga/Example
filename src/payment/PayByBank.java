package payment;

public class PayByBank implements PaymentType {
    @Override
    public void pay(){}
    public boolean pay(String studentID){
        return false;
    }
}
