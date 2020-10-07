package com.parkhuiwo0.core.order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);
}
