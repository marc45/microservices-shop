package pl.edu.amu.wmi.students.mario.microservices.shop.example.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.customer.domain.Customer;

/**
 * Created by Mariusz on 2017-06-04.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
