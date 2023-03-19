package com.kakaobank.transaction.service.logging.account.deposit;

import com.kakaobank.transaction.constant.KafkaEventType;
import com.kakaobank.transaction.constant.KafkaTopic;
import com.kakaobank.transaction.domain.logging.LogDepositAccount;
import com.kakaobank.transaction.exception.TransactionGeneratorException;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccountDepositLogginServiceTest {
    private static Logger logger = LoggerFactory.getLogger(AccountDepositLogginServiceTest.class);

    /**
     * 계좌입금 등록 로그 카프카 발행 테스트
     */
    @Test
    public void sendLoggingMessage() throws TransactionGeneratorException {
        LogDepositAccount.Builder builder = new LogDepositAccount.Builder();
        builder.setCustomerNumber("A123123");
        builder.setAccountNumber("3333012734448");
        builder.setDepositAmount("3000");
        builder.setTransactionDateTime("20230318101237");

        try{
            AccountDepositLogginService service = new AccountDepositLogginService();
            service.sendLoggingMessage(builder.build());
        } catch (TransactionGeneratorException e) {
            logger.info(e.getMessage());
            throw new TransactionGeneratorException(e.getMessage());
        }
    }
}