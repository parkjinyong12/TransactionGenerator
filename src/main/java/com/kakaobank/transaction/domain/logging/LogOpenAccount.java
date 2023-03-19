package com.kakaobank.transaction.domain.logging;

public class LogOpenAccount {
    /**
     * 고객번호
     */
    private String customerNumber;

    /**
     * 계좌번호
     */
    private String accountNumber;

    /**
     * 거래시각
     */
    private String transactionDateTime;

    public String getCustomerNumber() {
        return customerNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getTransactionDateTime() {
        return transactionDateTime;
    }

    public LogOpenAccount(Builder builder) {
        this.customerNumber = builder.customerNumber;
        this.accountNumber = builder.accountNumber;
        this.transactionDateTime = builder.transactionDateTime;
    }

    public static class Builder {
        private String customerNumber;
        private String accountNumber;
        private String transactionDateTime;

        public Builder setCustomerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }

        public Builder setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder setTransactionDateTime(String transactionDateTime) {
            this.transactionDateTime = transactionDateTime;
            return this;
        }

        public LogOpenAccount build() {
            return new LogOpenAccount(this);
        }
    }
}
