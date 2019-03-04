package com.batumbu.model.dto.request;

import javax.xml.bind.annotation.XmlRootElement;

import com.batumbu.model.module.Transfer;

@XmlRootElement(name="transferRequest")
public class TransferRequest {
 private Transfer transfer;

public Transfer getTransfer() {
	return transfer;
}

public void setTransfer(Transfer transfer) {
	this.transfer = transfer;
}
}
