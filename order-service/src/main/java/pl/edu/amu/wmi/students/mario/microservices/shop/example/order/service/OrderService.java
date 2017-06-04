package pl.edu.amu.wmi.students.mario.microservices.shop.example.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.order.domain.Order;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.order.repository.OrderRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by Mariusz on 2017-06-04.
 */
@Service
public class OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Optional<Order> findOne(Long id) {
        return Optional.ofNullable(orderRepository.findOne(id));
    }

    public Order save(Order order) {
        return orderRepository.save(order);
    }

    public void delete(Long id) {
        orderRepository.delete(id);
    }
}
