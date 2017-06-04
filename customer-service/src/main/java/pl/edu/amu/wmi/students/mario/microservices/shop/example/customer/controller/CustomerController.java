package pl.edu.amu.wmi.students.mario.microservices.shop.example.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.customer.domain.Customer;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.customer.httpexceptions.NotFoundException;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.customer.service.CustomerService;

import java.util.List;

/**
 * Created by Mariusz on 2017-06-04.
 */
@RestController
@RequestMapping("/customers")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Customer findOne(@PathVariable Long id) {
        return customerService.findOne(id).orElseThrow(NotFoundException::new);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer create(@RequestBody Customer customer) {
        customer.setId(null);
        return customerService.save(customer);
    }

    @PutMapping(path = "/{id}")
    public void update(@PathVariable Long id, Customer customer) {
        customerService.save(customer);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id) {
        customerService.delete(id);
    }
}
