package com.kakaobank.transaction.service.logging;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kakaobank.transaction.constant.KafkaEventType;
import com.kakaobank.transaction.constant.KafkaTopic;
import com.kakaobank.transaction.constant.Messages;
import com.kakaobank.transaction.exception.KafkaSendException;
import com.kakaobank.transaction.exception.TransactionGeneratorException;
import com.kakaobank.transaction.util.KafKaTemplate;

public class FdsTransactionLoggingService {

    private String topic;
    private String eventType;

    public String getTopic() {
        return this.topic;
    }

    public String getEventType() {
        return eventType;
    }

    public FdsTransactionLoggingService(String eventType) {
        this.topic = KafkaTopic.TOPIC_FDS_TRANSACTION;
        this.eventType = eventType;
    }

    /**
     * 로그 데이터를 특정 토픽의 메세지로 발행합니다.
     * @param model
     * @throws JsonProcessingException
     */
    public void sendLoggingMessage(Object model) throws TransactionGeneratorException {

        if(getTopic() == null) throw new KafkaSendException(Messages.EXCEPTION_NO_KAFKA_TOPIC);
        if(getEventType() == null) throw new KafkaSendException(Messages.EXCEPTION_NO_KAFKA_EVENT_TYPE);

        ObjectMapper mapper = new ObjectMapper();
        String loggingMessage;
        try {
            loggingMessage = mapper.writeValueAsString(model);
        } catch (JsonProcessingException e) {
            throw new TransactionGeneratorException(Messages.EXCEPTION_OBJECT_MAPPER_MODEL_TO_STRING, e);
        }

        KafKaTemplate<String, String> template = new KafKaTemplate<>();
        template.send(getTopic(), getEventType(), loggingMessage);
    }
}
