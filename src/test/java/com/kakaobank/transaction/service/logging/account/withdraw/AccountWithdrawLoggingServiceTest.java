package com.kakaobank.transaction.service.logging.account.withdraw;

import com.kakaobank.transaction.constant.KafkaEventType;
import com.kakaobank.transaction.constant.KafkaTopic;
import com.kakaobank.transaction.domain.logging.LogDepositAccount;
import com.kakaobank.transaction.domain.logging.LogWithdrawAccount;
import com.kakaobank.transaction.exception.TransactionGeneratorException;
import com.kakaobank.transaction.service.logging.account.deposit.AccountDepositLogginService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccountWithdrawLoggingServiceTest {
    private static Logger logger = LoggerFactory.getLogger(AccountWithdrawLoggingServiceTest.class);

    /**
     * 계좌인출 로그 카프카 발행 테스트
     */
    @Test
    public void sendLoggingMessage() throws TransactionGeneratorException {
        LogWithdrawAccount.Builder builder = new LogWithdrawAccount.Builder();
        builder.setCustomerNumber("123123");
        builder.setAccountNumber("3333012734448");
        builder.setWithdrawAmount("3000");
        builder.setTransactionDateTime("20230318101237");

        try{
            AccountWithdrawLoggingService service = new AccountWithdrawLoggingService();
            service.sendLoggingMessage(builder.build());
        } catch (TransactionGeneratorException e) {
            logger.info(e.getMessage());
            throw new TransactionGeneratorException(e.getMessage());
        }
    }
}