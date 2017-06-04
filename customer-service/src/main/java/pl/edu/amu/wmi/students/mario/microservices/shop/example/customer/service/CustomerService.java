package pl.edu.amu.wmi.students.mario.microservices.shop.example.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.customer.domain.Customer;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.customer.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by Mariusz on 2017-06-04.
 */
@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Optional<Customer> findOne(Long id) {
        return Optional.ofNullable(customerRepository.findOne(id));
    }

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public void delete(Long id) {
        customerRepository.delete(id);
    }
}
