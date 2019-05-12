package driver.enrollment;

import org.junit.Assert;
import org.junit.Test;
import payment.PayByBank;
import payment.PayByCreditCard;

public class PaymentTypeDriver {
    @Test
    public void testPay(){
        PayByBank payByBank = new PayByBank();
        PayByCreditCard payByCreditCard = new PayByCreditCard();
        boolean returnValue = payByBank.pay("cvkhafjkv");
        boolean returnValue1 = payByCreditCard.pay("hvcakjvbhszhfv","shvgj");
    }
}
