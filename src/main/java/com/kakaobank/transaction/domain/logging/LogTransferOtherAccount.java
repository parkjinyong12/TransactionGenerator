package com.kakaobank.transaction.domain.logging;

public class LogTransferOtherAccount {

    /**
     * 고객번호
     */
    private String customerNumber;

    /**
     * 송금 계좌번호
     */
    private String sendAccountNumber;

    /**
     * 수취은행
     */
    private String receiveBank;

    /**
     * 수취 계좌번호
     */
    private String receiveAccountNumber;

    /**
     * 수취 계좌주
     */
    private String receiveAccountPersonName;

    /**
     * 이체금액
     */
    private String transferAmount;

    /**
     * 거래시각
     */
    private String transactionDateTime;

    public String getCustomerNumber() {
        return customerNumber;
    }

    public String getSendAccountNumber() {
        return sendAccountNumber;
    }

    public String getReceiveBank() {
        return receiveBank;
    }

    public String getReceiveAccountNumber() {
        return receiveAccountNumber;
    }

    public String getReceiveAccountPersonName() {
        return receiveAccountPersonName;
    }

    public String getTransferAmount() {
        return transferAmount;
    }

    public String getTransactionDateTime() {
        return transactionDateTime;
    }

    public LogTransferOtherAccount(Builder builder) {
        this.customerNumber = builder.customerNumber;
        this.sendAccountNumber = builder.sendAccountNumber;
        this.receiveBank = builder.receiveBank;
        this.receiveAccountNumber = builder.receiveAccountNumber;
        this.receiveAccountPersonName = builder.receiveAccountPersonName;
        this.transferAmount = builder.transferAmount;
        this.transactionDateTime = builder.transactionDateTime;
    }

    public static class Builder {
        private String customerNumber;
        private String sendAccountNumber;
        private String receiveBank;
        private String receiveAccountNumber;
        private String receiveAccountPersonName;
        private String transferAmount;
        private String transactionDateTime;

        public Builder setCustomerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }

        public Builder setSendAccountNumber(String sendAccountNumber) {
            this.sendAccountNumber = sendAccountNumber;
            return this;
        }

        public Builder setReceiveBank(String receiveBank) {
            this.receiveBank = receiveBank;
            return this;
        }

        public Builder setReceiveAccountNumber(String receiveAccountNumber) {
            this.receiveAccountNumber = receiveAccountNumber;
            return this;
        }

        public Builder setReceiveAccountPersonName(String receiveAccountPersonName) {
            this.receiveAccountPersonName = receiveAccountPersonName;
            return this;
        }

        public Builder setTransferAmount(String transferAmount) {
            this.transferAmount = transferAmount;
            return this;
        }

        public Builder setTransactionDateTime(String transactionDateTime) {
            this.transactionDateTime = transactionDateTime;
            return this;
        }

        public LogTransferOtherAccount build() {
            return new LogTransferOtherAccount(this);
        }
    }
}
