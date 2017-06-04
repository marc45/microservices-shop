package pl.edu.amu.wmi.students.mario.microservices.shop.example.category.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.category.domain.Category;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.category.repository.CategoryRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by Mariusz on 2017-06-04.
 */
@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Optional<Category> findOne(Long id) {
        return Optional.ofNullable(categoryRepository.findOne(id));
    }

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public void delete(Long id) {
        categoryRepository.delete(id);
    }
}
