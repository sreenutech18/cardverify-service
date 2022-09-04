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
public class CardResponse {
	
	private String respCode;
	private String respMsg;
	private String status;
	public String getRespCode() {
		return respCode;
	}
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	public String getRespMsg() {
		return respMsg;
	}
	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CardResponse [respCode=");
		builder.append(respCode);
		builder.append(", respMsg=");
		builder.append(respMsg);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
	
	

}
