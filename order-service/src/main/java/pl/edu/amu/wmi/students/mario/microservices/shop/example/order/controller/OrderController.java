package pl.edu.amu.wmi.students.mario.microservices.shop.example.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.order.domain.Order;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.order.httpexceptions.NotFoundException;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.order.service.OrderService;

import java.util.List;

/**
 * Created by Mariusz on 2017-06-04.
 */
@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> findAll() {
        return orderService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Order findOne(@PathVariable Long id) {
        return orderService.findOne(id).orElseThrow(NotFoundException::new);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Order create(@RequestBody Order order) {
        order.setId(null);
        return orderService.save(order);
    }

    @PutMapping(path = "/{id}")
    public void update(@PathVariable Long id, Order order) {
        orderService.save(order);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id) {
        orderService.delete(id);
    }
}
