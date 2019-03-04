package com.batumbu.model.dto.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "trxInqRequest")
public class TransactionInquiryRequest {
	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}
