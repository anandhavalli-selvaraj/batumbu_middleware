package com.batumbu.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.batumbu.model.dto.request.UserRequest;


@RestController
public class AuthorizationController {

	@PostMapping("/account/login")
	public ResponseEntity<Object> generateToken(@RequestBody UserRequest userRequest)
	{
		return null;
		
	}
}
