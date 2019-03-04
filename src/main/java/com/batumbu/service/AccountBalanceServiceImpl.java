package com.batumbu.service;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.batumbu.config.XMLParser;
import com.batumbu.model.dto.request.Balance;
import com.batumbu.model.dto.request.BalanceRequest;
import com.batumbu.service.impl.AccountBalanceService;
@Service
public class AccountBalanceServiceImpl implements AccountBalanceService {

	@Autowired
	private XMLParser xmlParser;
	@Override
	public String checkBalance(String accountNo) {
		BalanceRequest  balanceRequest=new BalanceRequest();
		Balance balance=new Balance();
		 balanceRequest.setBalance(balance);
		 balance.setAccountNo("10001");
		 try {
			xmlParser.parseJavaObjectToXML( balanceRequest, BalanceRequest.class) ;
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
