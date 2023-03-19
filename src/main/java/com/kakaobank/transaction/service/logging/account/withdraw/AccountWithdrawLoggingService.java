package com.kakaobank.transaction.service.logging.account.withdraw;

import com.kakaobank.transaction.constant.KafkaEventType;
import com.kakaobank.transaction.service.logging.FdsTransactionLoggingService;

public class AccountWithdrawLoggingService extends FdsTransactionLoggingService {

    public AccountWithdrawLoggingService() {
        super(KafkaEventType.EVENT_TYPE_ACCOUNT_WITHDRAW);
    }
}
