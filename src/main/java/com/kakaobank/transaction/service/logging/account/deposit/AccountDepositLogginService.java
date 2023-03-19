package com.kakaobank.transaction.service.logging.account.deposit;

import com.kakaobank.transaction.constant.KafkaEventType;
import com.kakaobank.transaction.service.logging.FdsTransactionLoggingService;

public class AccountDepositLogginService extends FdsTransactionLoggingService {
    public AccountDepositLogginService() {
        super(KafkaEventType.EVENT_TYPE_ACCOUNT_DEPOSIT);
    }
}

