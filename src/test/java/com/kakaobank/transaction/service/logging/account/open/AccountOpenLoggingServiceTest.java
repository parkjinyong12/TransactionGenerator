package com.kakaobank.transaction.service.logging.account.open;

import com.kakaobank.transaction.constant.KafkaEventType;
import com.kakaobank.transaction.constant.KafkaTopic;
import com.kakaobank.transaction.domain.logging.LogDepositAccount;
import com.kakaobank.transaction.domain.logging.LogOpenAccount;
import com.kakaobank.transaction.exception.TransactionGeneratorException;
import com.kakaobank.transaction.service.logging.account.deposit.AccountDepositLogginService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccountOpenLoggingServiceTest {
    private static Logger logger = LoggerFactory.getLogger(AccountOpenLoggingServiceTest.class);

    /**
     * 계좌개설 로그 카프카 발행 테스트
     */
    @Test
    public void sendLoggingMessage() throws TransactionGeneratorException {
        LogOpenAccount.Builder builder = new LogOpenAccount.Builder();
        builder.setCustomerNumber("A123123");
        builder.setAccountNumber("3333012734448");
        builder.setTransactionDateTime("20230318101237");

        try{
            AccountOpenLoggingService service = new AccountOpenLoggingService();
            service.sendLoggingMessage(builder.build());
        } catch (TransactionGeneratorException e) {
            logger.info(e.getMessage());
            throw new TransactionGeneratorException(e.getMessage());
        }
    }
}