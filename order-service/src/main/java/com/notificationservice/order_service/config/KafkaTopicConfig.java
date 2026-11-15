package com.notificationservice.order_service.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.kafka.config.TopicBuilder;

public class KafkaTopicConfig {

    public static final String ORDER_EVENT_TOPICS = "order-events";

    public NewTopic orderEventTopic() {
        return TopicBuilder.name(ORDER_EVENT_TOPICS)
                .partitions(3)
                .replicas(1)
                .build();
    }

}
