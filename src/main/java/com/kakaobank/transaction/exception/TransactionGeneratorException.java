package com.kakaobank.transaction.exception;

public class TransactionGeneratorException extends Exception {
    public TransactionGeneratorException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransactionGeneratorException(String message) {
        super(message);
    }

    public TransactionGeneratorException(Throwable cause) {
        super(cause);
    }
}
