package com.kakaobank.transaction.domain.logging;

public class LogWithdrawAccount {

    /**
     * 고객번호
     */
    private String customerNumber;

    /**
     * 출금 계좌번호
     */
    private String accountNumber;

    /**
     * 출금금액
     */
    private String withdrawAmount;

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

    public String getWithdrawAmount() {
        return withdrawAmount;
    }

    public String getTransactionDateTime() {
        return transactionDateTime;
    }

    public LogWithdrawAccount(Builder builder) {
        this.customerNumber = builder.customerNumber;
        this.accountNumber = builder.accountNumber;
        this.withdrawAmount = builder.withdrawAmount;
        this.transactionDateTime = builder.transactionDateTime;
    }

    public static class Builder {
        private String customerNumber;
        private String accountNumber;
        private String withdrawAmount;
        private String transactionDateTime;

        public Builder setCustomerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }

        public Builder setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder setWithdrawAmount(String withdrawAmount) {
            this.withdrawAmount = withdrawAmount;
            return this;
        }

        public Builder setTransactionDateTime(String transactionDateTime) {
            this.transactionDateTime = transactionDateTime;
            return this;
        }

        public LogWithdrawAccount build() {
            return new LogWithdrawAccount(this);
        }
    }
}
