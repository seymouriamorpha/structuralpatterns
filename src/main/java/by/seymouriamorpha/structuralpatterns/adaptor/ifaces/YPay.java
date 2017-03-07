package by.seymouriamorpha.structuralpatterns.adaptor.ifaces;

/**
 * @author Eugene Kortelyov on 3/7/2017.
 */
public interface YPay {

    String getCustCardNo();
    String getCardOwnerName();
    String getCardExpMonthDate();
    Integer getCVVNo();
    Double getTotalAmount();

    void setCustCardNo(String custCardNo);
    void setCardOwnerName(String cardOwnerName);
    void setCardExpMonthDate(String cardExpMonthDate);
    void setCVVNo(Integer cVVNo);
    void setTotalAmount(Double totalAmount);

}
