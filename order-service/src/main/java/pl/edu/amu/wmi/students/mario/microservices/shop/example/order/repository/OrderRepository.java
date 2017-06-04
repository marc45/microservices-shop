package pl.edu.amu.wmi.students.mario.microservices.shop.example.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.order.domain.Order;

/**
 * Created by Mariusz on 2017-06-04.
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
