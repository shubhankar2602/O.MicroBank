package com.oracle.kyc.exception;

@SuppressWarnings("serial")
public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(String customerId) {
        super("Customer with ID " + customerId + " not found.");
    }
}
