package com.notificationService.notification_commons.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderEvent {
    private String orderId;
    private String customerId;
    private String customerEmail;
    private String customerPhone;
    private BigDecimal amount;
    private OrderStatus status;
    private Instant timestamp;


    public OrderEvent(String orderId) {
        this.orderId = orderId;
    }
}
