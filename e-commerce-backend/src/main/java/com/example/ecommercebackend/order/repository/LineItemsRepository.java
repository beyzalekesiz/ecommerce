package com.example.ecommercebackend.order.repository;

import com.example.ecommercebackend.order.model.OrderLineItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LineItemsRepository extends JpaRepository<OrderLineItems, Long> {
}
