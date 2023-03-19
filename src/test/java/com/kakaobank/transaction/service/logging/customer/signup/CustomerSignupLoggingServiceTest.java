package com.kakaobank.transaction.service.logging.customer.signup;

import com.kakaobank.transaction.constant.KafkaEventType;
import com.kakaobank.transaction.constant.KafkaTopic;
import com.kakaobank.transaction.domain.logging.LogSignupCustomer;
import com.kakaobank.transaction.exception.TransactionGeneratorException;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class CustomerSignupLoggingServiceTest {
    private static Logger logger = LoggerFactory.getLogger(CustomerSignupLoggingServiceTest.class);

    /**
     * 고객 계좌등록 로그 카프카 발행 테스트
     */
    @Test
    public void sendLoggingMessage() throws TransactionGeneratorException {
        LogSignupCustomer.Builder builder = new LogSignupCustomer.Builder();
        builder.setCustomerNumber("A123123");
        builder.setCustomerName("한민영");
        builder.setBirthdayDate("19921221");
        builder.setSignupDateTime("20230318111327");

        try{
            CustomerSignupLoggingService service = new CustomerSignupLoggingService();
            service.sendLoggingMessage(builder.build());
        } catch (TransactionGeneratorException e) {
            logger.info(e.getMessage());
            throw new TransactionGeneratorException(e.getMessage());
        }
    }
}