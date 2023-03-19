package com.kakaobank.transaction.domain.logging;

public class LogSignupCustomer {

    /**
     * 고객번호
     */
    private String customerNumber;
    /**
     * 고객명
     */
    private String customerName;
    /**
     * 생년월일
     */
    private String birthdayDate;
    /**
     * 가입시각
     */
    private String signupDateTime;

    public String getCustomerNumber() {
        return customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public String getSignupDateTime() {
        return signupDateTime;
    }

    private LogSignupCustomer(Builder builder) {
        this.customerNumber = builder.customerNumber;
        this.customerName = builder.customerName;
        this.birthdayDate = builder.birthdayDate;
        this.signupDateTime = builder.signupDateTime;
    }
    public static class Builder {
        private String customerNumber;
        private String customerName;
        private String birthdayDate;
        private String signupDateTime;

        public Builder setCustomerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }

        public Builder setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder setBirthdayDate(String birthdayDate) {
            this.birthdayDate = birthdayDate;
            return this;
        }

        public Builder setSignupDateTime(String signupDateTime) {
            this.signupDateTime = signupDateTime;
            return this;
        }

        public LogSignupCustomer build() {
            return new LogSignupCustomer(this);
        }
    }
}
