package by.seymouriamorpha.structuralpatterns.adaptor;

import by.seymouriamorpha.structuralpatterns.adaptor.adaptors.XPayToYPayAdapter;
import by.seymouriamorpha.structuralpatterns.adaptor.ifaces.XPay;
import by.seymouriamorpha.structuralpatterns.adaptor.ifaces.YPay;
import by.seymouriamorpha.structuralpatterns.adaptor.impls.XPayImpl;

/**
 * @author Eugene Kortelyov on 3/7/2017.
 */
public class RunPayment {

    public static void main(String[] args) {
        XPay xpay = new XPayImpl();
        xpay.setCreditCardNo("4900000000000086");
        xpay.setCustomerName("Eugene Kortelyov");
        xpay.setCardExpMonth("12");
        xpay.setCardExpYear("18");
        xpay.setCardCVVNo((short)123);
        xpay.setAmount(5869.40);

        YPay ypay = new XPayToYPayAdapter(xpay);
        testYPay(ypay);
    }

    private static void testYPay(YPay ypay){
        System.out.println(ypay.getCardOwnerName());
        System.out.println(ypay.getCustCardNo());
        System.out.println(ypay.getCardExpMonthDate());
        System.out.println(ypay.getCVVNo());
        System.out.println(ypay.getTotalAmount());
    }

}
