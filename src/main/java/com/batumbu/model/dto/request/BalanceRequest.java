package com.batumbu.model.dto.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="balanceRequest")
public class BalanceRequest {
	private Balance balance;

	public Balance getBalance() {
		return balance;
	}

	public void setBalance(Balance balance) {
		this.balance = balance;
	}
}
