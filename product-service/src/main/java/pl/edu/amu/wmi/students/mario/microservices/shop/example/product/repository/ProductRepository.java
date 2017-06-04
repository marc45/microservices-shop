package pl.edu.amu.wmi.students.mario.microservices.shop.example.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.product.domain.Product;

/**
 * Created by Mariusz on 2017-06-04.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
