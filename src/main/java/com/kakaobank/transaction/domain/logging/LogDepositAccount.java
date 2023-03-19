package com.kakaobank.transaction.domain.logging;

public class LogDepositAccount {

    /**
     * 고객번호
     */
    private String customerNumber;

    /**
     * 입금 계좌번호
     */
    private String accountNumber;

    /**
     * 입금금액
     */
    private String depositAmount;

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

    public String getDepositAmount() {
        return depositAmount;
    }

    public String getTransactionDateTime() {
        return transactionDateTime;
    }

    public LogDepositAccount(Builder builder) {
        this.customerNumber = builder.customerNumber;
        this.accountNumber = builder.accountNumber;
        this.depositAmount = builder.depositAmount;
        this.transactionDateTime = builder.transactionDateTime;
    }

    public static class Builder {
        private String customerNumber;
        private String accountNumber;
        private String depositAmount;
        private String transactionDateTime;

        public Builder setCustomerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }

        public Builder setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder setDepositAmount(String depositAmount) {
            this.depositAmount = depositAmount;
            return this;
        }

        public Builder setTransactionDateTime(String transactionDateTime) {
            this.transactionDateTime = transactionDateTime;
            return this;
        }

        public LogDepositAccount build() {
            return new LogDepositAccount(this);
        }
    }
}
