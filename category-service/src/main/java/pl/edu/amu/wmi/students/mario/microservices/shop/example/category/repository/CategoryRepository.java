package pl.edu.amu.wmi.students.mario.microservices.shop.example.category.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.category.domain.Category;

/**
 * Created by Mariusz on 2017-06-04.
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
