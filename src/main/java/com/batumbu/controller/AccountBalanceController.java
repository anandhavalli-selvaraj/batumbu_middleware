package com.batumbu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.batumbu.model.dto.request.Balance;
import com.batumbu.service.impl.AccountBalanceService;

@RestController
public class AccountBalanceController {
	@Autowired
	private AccountBalanceService accountBalanceService;
	
	@GetMapping("/account/balance")
	public ResponseEntity<Object> checkBalance(@RequestParam("accountNo")String accountNo)
	{
		Balance balanceRequest=new Balance();
		balanceRequest.setAccountNo(accountNo);
		return new ResponseEntity<Object>(HttpStatus.OK);
		
	}
}
