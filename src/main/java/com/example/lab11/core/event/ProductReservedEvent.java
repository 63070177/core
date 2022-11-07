package com.example.lab11.core.event;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductReservedEvent {
    private final String productId;
    private final int quantity;
    private final String orderId;
    private String userId;
}
