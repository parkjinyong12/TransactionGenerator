package com.kakaobank.transaction.util;

import com.kakaobank.transaction.constant.Messages;
import com.kakaobank.transaction.constant.ServiceCode;
import com.kakaobank.transaction.domain.kafka.ProducerCallback;
import com.kakaobank.transaction.exception.KafkaSendException;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class KafKaTemplate<K, V> {

    private static Logger logger = LoggerFactory.getLogger(KafKaTemplate.class);
    private Properties properties;


    public KafKaTemplate() {

        //TODO 별도의 properties 파일을 로드하는 방식으로 변경해야 함 (config/kafka.properties)
        Properties prop = new Properties();
        prop.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        prop.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        prop.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        properties = prop;
    }

    public void send(String topic, String payload) throws KafkaSendException {
        send(topic, null, payload);
    }

    public void send(String topic, String eventType, String payload) throws KafkaSendException {
        Producer<K, V> producer = new KafkaProducer<>(properties);
        try {
            ProducerRecord record = new ProducerRecord(topic, payload);

            // eventType 분기가 필요한 경우
            if(ServiceCode.SERVICE_CODE_EVENT_TYPE != null) {
                record.headers().add(ServiceCode.SERVICE_CODE_EVENT_TYPE, eventType.getBytes(StandardCharsets.UTF_8));
            }
            producer.send(record, new ProducerCallback());
        } finally {
            logger.info(Messages.MESSAGE_SEND_CLOSE);
            producer.close();
        }
    }
}
