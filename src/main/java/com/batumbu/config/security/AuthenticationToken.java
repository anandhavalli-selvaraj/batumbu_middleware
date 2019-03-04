package com.batumbu.config.security;

import org.scribe.model.Token;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class AuthenticationToken extends UsernamePasswordAuthenticationToken{

	private Token token;

	public AuthenticationToken(Token token) {
		super(token, null);
		this.token = token;
	}

	public Token getAccessToken() {
		return token;
	}
}
