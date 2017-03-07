package by.seymouriamorpha.structuralpatterns.adaptor.ifaces;

/**
 * @author Eugene Kortelyov on 3/7/2017.
 */
public interface XPay {

    String getCreditCardNo();
    String getCustomerName();
    String getCardExpMonth();
    String getCardExpYear();
    Short getCardCVVNo();
    Double getAmount();

    void setCreditCardNo(String creditCardNo);
    void setCustomerName(String customerName);
    void setCardExpMonth(String cardExpMonth);
    void setCardExpYear(String cardExpYear);
    void setCardCVVNo(Short cardCVVNo);
    void setAmount(Double amount);

}
