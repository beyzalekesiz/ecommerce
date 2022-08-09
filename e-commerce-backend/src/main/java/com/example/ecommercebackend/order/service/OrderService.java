package com.example.ecommercebackend.order.service;

import com.example.ecommercebackend.order.model.OrderLineItems;
import com.example.ecommercebackend.order.model.Orders;
import com.example.ecommercebackend.order.repository.LineItemsRepository;
import com.example.ecommercebackend.order.repository.OrderRepository;
import com.example.ecommercebackend.product.model.Category;
import com.example.ecommercebackend.product.model.Product;
import com.example.ecommercebackend.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Transient;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private LineItemsRepository lineItemsRepository;


    public List<Orders> getAllOrders() {
        List<Orders> listOfOrders = orderRepository.findAll();
        return listOfOrders;
    }

    public Long getTotalPrice (List<Product> product){
        product.stream().count();
        return null;
    }

    public void addOrder(Orders order) { orderRepository.save(order); }
    public void deleteOrder(Long id) { orderRepository.deleteById(id); }
    public void deleteAllOrders() { orderRepository.deleteAll(); }

    public void updateOrderByID(Orders order, Long id) throws Exception {
        Optional<Orders> updateOrder = orderRepository.findById(id);

        if(updateOrder.isPresent()) {
            order.setId(updateOrder.get().getId());
            orderRepository.save(order);
        }
        else throw new Exception("Order not found.");
    }

    /*@Transient //to not save in database
    public Double getTotalPrice() {
        Double sum = 0.0;
        List<OrderLineItems> orderProducts = (lineItemsRepository.findAll());

    }*/

}
