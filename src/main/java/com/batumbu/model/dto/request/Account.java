package com.batumbu.model.dto.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "account")
public class Account {
	private String accountNo;
	private String fromDate;
	private String toDate;
	private String direction;

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}
}
