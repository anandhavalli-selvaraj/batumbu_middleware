package com.batumbu.config.security;

import org.scribe.model.Token;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class JwtValidator {
	private static final Logger log=LoggerFactory.getLogger(JwtValidator.class);
	private String security="secret_string";
	
	public Token validateToken(String token)
	{
		return null;
	}

}
