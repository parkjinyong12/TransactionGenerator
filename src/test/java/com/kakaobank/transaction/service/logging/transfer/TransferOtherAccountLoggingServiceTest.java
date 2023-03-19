package com.kakaobank.transaction.service.logging.transfer;

import com.kakaobank.transaction.constant.KafkaTopic;
import com.kakaobank.transaction.domain.logging.LogSignupCustomer;
import com.kakaobank.transaction.domain.logging.LogTransferOtherAccount;
import com.kakaobank.transaction.exception.TransactionGeneratorException;
import com.kakaobank.transaction.service.logging.customer.signup.CustomerSignupLoggingService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransferOtherAccountLoggingServiceTest {
    private static Logger logger = LoggerFactory.getLogger(TransferOtherAccountLoggingServiceTest.class);

    /**
     * 고객 타행이체 로그 카프카 발행 테스트
     */
    @Test
    public void sendLoggingMessage() throws TransactionGeneratorException {
        LogTransferOtherAccount.Builder builder = new LogTransferOtherAccount.Builder();
        builder.setCustomerNumber("A123123");
        builder.setSendAccountNumber("3333012734448");
        builder.setReceiveBank("016");
        builder.setReceiveAccountNumber("115312003235");
        builder.setReceiveAccountPersonName("한미연");
        builder.setTransferAmount("5000");
        builder.setTransactionDateTime("20230319133202");

        LogTransferOtherAccount message = builder.build();
        try{
            TransferOtherAccountLoggingService service = new TransferOtherAccountLoggingService();
            service.sendLoggingMessage(message);
        } catch (TransactionGeneratorException e) {
            logger.info("Error: {}",e.getCause());
            throw new TransactionGeneratorException(e.getMessage());
        }
    }
}