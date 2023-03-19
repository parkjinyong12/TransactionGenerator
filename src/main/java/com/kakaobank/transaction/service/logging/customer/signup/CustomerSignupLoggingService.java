package com.kakaobank.transaction.service.logging.customer.signup;

import com.kakaobank.transaction.constant.KafkaEventType;
import com.kakaobank.transaction.service.logging.FdsTransactionLoggingService;

public class CustomerSignupLoggingService extends FdsTransactionLoggingService {

    public CustomerSignupLoggingService() {
        super(KafkaEventType.EVENT_TYPE_CUSTOMER_SIGNUP);
    }
}
