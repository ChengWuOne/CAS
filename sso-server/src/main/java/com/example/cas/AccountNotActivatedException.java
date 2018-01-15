package com.example.cas;

import javax.security.auth.login.FailedLoginException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccountNotActivatedException extends FailedLoginException{
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountNotActivatedException.class);

	private static final long serialVersionUID = 802556922354616286L;  
	
	public AccountNotActivatedException() {
		super();
	}
	public AccountNotActivatedException(String msg) {
		
		super(msg);
		LOGGER.debug(msg);
		
	}

}
