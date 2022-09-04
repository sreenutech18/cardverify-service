/**
 * @Author : Sreenu
 *  COPY Rights all are reserved, 
    dont disclose the information outsiders
    other wise temrs and conditions will apply.
   
 */
package com.barclays.cards.model;

/**
 * @author sreenu
 *
 */
public class CardRequest {
	
	private String cardNum;
	private String cvv;
	private String nameOnCard;
	private String expDate;
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CardRequest [cardNum=");
		builder.append(cardNum);
		builder.append(", cvv=");
		builder.append(cvv);
		builder.append(", nameOnCard=");
		builder.append(nameOnCard);
		builder.append(", expDate=");
		builder.append(expDate);
		builder.append("]");
		return builder.toString();
	}
	
	

}
