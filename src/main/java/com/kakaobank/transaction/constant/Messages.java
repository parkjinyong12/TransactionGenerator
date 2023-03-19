package com.kakaobank.transaction.constant;

public class Messages {

    /**
     * Exception
     */
    public static final String EXCEPTION_NO_KAFKA_TOPIC = "카프카 토픽이 정의되지 않았습니다.";
    public static final String EXCEPTION_NO_KAFKA_EVENT_TYPE = "이벤트 타입이 정의되지 않았습니다.";
    public static final String EXCEPTION_OBJECT_MAPPER_MODEL_TO_STRING = "데이터 형변환 중 발생한 에러 입니다. Model to String";

    /**
     * Message
     */
    public static final String MESSAGE_SEND_SUCCESS = "메세지 발송에 성공하였습니다.";
    public static final String MESSAGE_SEND_FAIL = "메세지 발송에 실패하였습니다.";
    public static final String MESSAGE_SEND_CLOSE = "메세지 발송이 종료되었습니다.";
}
