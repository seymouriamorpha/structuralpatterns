package by.seymouriamorpha.structuralpatterns.adaptor.adaptors;

import by.seymouriamorpha.structuralpatterns.adaptor.ifaces.XPay;
import by.seymouriamorpha.structuralpatterns.adaptor.ifaces.YPay;

/**
 * @author Eugene Kortelyov on 3/7/2017.
 */
public class XPayToYPayAdapter implements YPay {

    private String custCardNo;
    private String cardOwnerName;
    private String cardExpMonthDate;
    private Integer cVVNo;
    private Double totalAmount;

    private final XPay xpay;

    public XPayToYPayAdapter(XPay xpay){
        this.xpay = xpay;
        setProp();
    }

    @Override
    public String getCustCardNo() {
        return custCardNo;
    }
    @Override
    public void setCustCardNo(String custCardNo) {
        this.custCardNo = custCardNo;
    }

    @Override
    public String getCardOwnerName() {
        return cardOwnerName;
    }
    @Override
    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    @Override
    public String getCardExpMonthDate() {
        return cardExpMonthDate;
    }
    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        this.cardExpMonthDate = cardExpMonthDate;
    }

    @Override
    public Integer getCVVNo() {
        return cVVNo;
    }
    @Override
    public void setCVVNo(Integer cVVNo) {
        this.cVVNo = cVVNo;
    }

    @Override
    public Double getTotalAmount() {
        return totalAmount;
    }
    @Override
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    private void setProp(){
        setCardOwnerName(this.xpay.getCustomerName());
        setCustCardNo(this.xpay.getCreditCardNo());
        setCardExpMonthDate(this.xpay.getCardExpMonth()+"/"+this.xpay.getCardExpYear());
        setCVVNo(this.xpay.getCardCVVNo().intValue());
        setTotalAmount(this.xpay.getAmount());
    }

}
