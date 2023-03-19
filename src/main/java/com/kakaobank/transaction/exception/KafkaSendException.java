package com.kakaobank.transaction.exception;

public class KafkaSendException extends TransactionGeneratorException {
    public KafkaSendException(String message, Throwable cause) {
        super(message, cause);
    }

    public KafkaSendException(String message) {
        super(message);
    }

    public KafkaSendException(Throwable cause) {
        super(cause);
    }
}
