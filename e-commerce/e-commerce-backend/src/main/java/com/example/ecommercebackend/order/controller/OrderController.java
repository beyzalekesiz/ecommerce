package com.example.ecommercebackend.order.controller;

import com.example.ecommercebackend.common.ApiResponse;
import com.example.ecommercebackend.order.model.Orders;
import com.example.ecommercebackend.order.service.OrderService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Getter
@Setter
@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/getAllOrders")
    public List<Orders>getAllOrders () {
        List<Orders> listOfOrders = orderService.getAllOrders();
        return listOfOrders;
    }

    @PostMapping("/addOrder")
    public ApiResponse addOrder(@RequestBody Orders order){
        orderService.addOrder(order);
        return new ApiResponse(true, "Category created.");
    }

    @DeleteMapping("/deleteOrderByID/{id}")
    public ApiResponse deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
        return new ApiResponse(true, "Order created.");
    }

    @DeleteMapping("/deleteAllOrders")
    public ApiResponse deleteAllOrders() {
        orderService.deleteAllOrders();
        return new ApiResponse(true, "Order created.");
    }

    @PutMapping("/updateOrderByID/{id}")
    public ApiResponse updateOrder(@RequestBody Orders order, @PathVariable Long id) {
        try {
            orderService.updateOrderByID(order, id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return new ApiResponse(true,"Order updated.");
    }

}
