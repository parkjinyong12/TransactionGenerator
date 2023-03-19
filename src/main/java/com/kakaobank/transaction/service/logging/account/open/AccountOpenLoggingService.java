package com.kakaobank.transaction.service.logging.account.open;

import com.kakaobank.transaction.constant.KafkaEventType;
import com.kakaobank.transaction.service.logging.FdsTransactionLoggingService;

public class AccountOpenLoggingService extends FdsTransactionLoggingService {

    public AccountOpenLoggingService() {
        super(KafkaEventType.EVENT_TYPE_ACCOUNT_OPEN);
    }
}
