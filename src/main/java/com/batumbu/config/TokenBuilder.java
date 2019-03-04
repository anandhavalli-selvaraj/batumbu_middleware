package com.batumbu.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TokenBuilder {

	@Value("${corpID}")
	private String corpID;
	
}
