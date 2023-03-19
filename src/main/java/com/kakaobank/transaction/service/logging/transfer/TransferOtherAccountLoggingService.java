package com.kakaobank.transaction.service.logging.transfer;

import com.kakaobank.transaction.constant.KafkaEventType;
import com.kakaobank.transaction.service.logging.FdsTransactionLoggingService;

public class TransferOtherAccountLoggingService extends FdsTransactionLoggingService {

    public TransferOtherAccountLoggingService() {
        super(KafkaEventType.EVENT_TYPE_TRANSFER_OTHER_ACCOUNT);
    }
}
