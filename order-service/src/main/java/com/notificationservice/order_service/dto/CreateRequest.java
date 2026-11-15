package com.notificationservice.order_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateRequest {

    private String customerId;

    private String customerEmail;

    private String customerPhone;

    private BigDecimal amount;
}
