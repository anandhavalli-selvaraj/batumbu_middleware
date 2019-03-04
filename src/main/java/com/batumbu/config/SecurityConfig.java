package com.batumbu.config;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.batumbu.config.security.AuthenticationProvider;
import com.batumbu.config.security.AuthenticationTokenFilter;


public class SecurityConfig  extends WebSecurityConfigurerAdapter{
    
	@Autowired
	private AuthenticationProvider authenticationProvider;

	private static final Logger LOGGER = LoggerFactory.getLogger(SecurityConfig.class);
//
//	@Override
//	protected UserDetailsService userDetailsService() {
//		if (userService == null) {
//			userService = new UserService();
//		}
//		return userService;
//	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		LOGGER.info(" Web Security configure  the Authentication Manager Builer {} " + auth.toString());
		auth.userDetailsService(userDetailsService());
	}

	@Bean
	public AuthenticationTokenFilter authenticationTokenFilter() {
		AuthenticationTokenFilter filter = new AuthenticationTokenFilter();
		filter.setAuthenticationManager(authenticationManager());
		//filter.setAuthenticationSuccessHandler(new SuccessHandler());
		return filter;
	}

	@Bean
	public AuthenticationManager authenticationManager() {
		return new ProviderManager(Collections.singletonList(getAuthenticationProvider()));
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		LOGGER.info("Configure the HTTP Security for rest end points");
		http.cors().and().csrf().disable().authorizeRequests().antMatchers("**/rest/**,**/account/**").authenticated().and()
				.addFilterBefore(authenticationTokenFilter(), UsernamePasswordAuthenticationFilter.class)
				.exceptionHandling().and().sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}
	/*
	 * production url of xero hosted on --https://xero.validus.sg
	staging url of xero hosted on ---https://devhub.validus.sg
	*/
	
	@Bean
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.addAllowedOrigin("*");
		config.addAllowedHeader("*");
		config.addExposedHeader(HttpHeaders.AUTHORIZATION);
		config.addAllowedMethod("*");
		source.registerCorsConfiguration("/**", config);
		return new CorsFilter(source);
	}

	

	public AuthenticationProvider getAuthenticationProvider() {
		if (authenticationProvider == null)
			authenticationProvider = new AuthenticationProvider();
		return authenticationProvider;
	}
}
