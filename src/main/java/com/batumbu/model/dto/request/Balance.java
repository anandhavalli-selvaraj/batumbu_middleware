package com.batumbu.model.dto.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="balance")
public class Balance {
	private String accountNo;
	private String accountCurrency;
	private String date;
	private String ledgerBalance;
	private String availableBalance;
	private String holdAmount;
	private String overdraftLimit;
	public String getAccountCurrency() {
		return accountCurrency;
	}

	public void setAccountCurrency(String accountCurrency) {
		this.accountCurrency = accountCurrency;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLedgerBalance() {
		return ledgerBalance;
	}

	public void setLedgerBalance(String ledgerBalance) {
		this.ledgerBalance = ledgerBalance;
	}

	public String getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(String availableBalance) {
		this.availableBalance = availableBalance;
	}

	public String getHoldAmount() {
		return holdAmount;
	}

	public void setHoldAmount(String holdAmount) {
		this.holdAmount = holdAmount;
	}

	public String getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(String overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
}
