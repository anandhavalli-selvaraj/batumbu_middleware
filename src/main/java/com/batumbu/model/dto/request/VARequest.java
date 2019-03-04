package com.batumbu.model.dto.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="vaRequest")
public class VARequest {
	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}
