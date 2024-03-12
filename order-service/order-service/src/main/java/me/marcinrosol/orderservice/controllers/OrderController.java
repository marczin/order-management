package me.marcinrosol.orderservice.controllers;

import me.marcinrosol.openapi.api.OrderManagerApi;
import me.marcinrosol.openapi.model.GetOrderResponse;
import me.marcinrosol.openapi.model.NewOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController implements OrderManagerApi {

    @Override
    public ResponseEntity<Void> createOrder(NewOrder newOrder) {
        return OrderManagerApi.super.createOrder(newOrder);
    }

    @Override
    public ResponseEntity<GetOrderResponse> getOrderById(String orderId) {
        return OrderManagerApi.super.getOrderById(orderId);
    }
}
