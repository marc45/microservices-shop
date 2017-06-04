package pl.edu.amu.wmi.students.mario.microservices.shop.example.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.cart.domain.Cart;

/**
 * Created by Mariusz on 2017-06-04.
 */
public interface CartRepository extends JpaRepository<Cart, Long> {
}
