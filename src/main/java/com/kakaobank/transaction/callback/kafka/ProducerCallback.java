package com.kakaobank.transaction.callback.kafka;

import com.kakaobank.transaction.constant.Messages;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ProducerCallback implements Callback {
    private static Logger logger = LoggerFactory.getLogger(ProducerCallback.class);

    @Override
    public void onCompletion(RecordMetadata recordMetadata, Exception e) {
        if (e == null) {
            // 성공
            logger.info("topic: "+ recordMetadata.topic() + ". " + Messages.MESSAGE_SEND_SUCCESS);
        }
        else {
            // 실패
            logger.info("topic: "+ recordMetadata.topic() + ". " + Messages.MESSAGE_SEND_FAIL);
        }
    }
}
