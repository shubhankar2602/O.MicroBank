package com.oracle.kyc.exception;

@SuppressWarnings("serial")
public class IdentityMismatchException extends RuntimeException {
    public IdentityMismatchException(String message) {
    	super(message);
    }
}
