package pl.edu.amu.wmi.students.mario.microservices.shop.example.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.product.domain.Product;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.product.httpexceptions.NotFoundException;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.product.service.ProductService;

import java.util.List;

/**
 * Created by Mariusz on 2017-06-04.
 */
@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Product findOne(@PathVariable Long id) {
        return productService.findOne(id).orElseThrow(NotFoundException::new);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product create(@RequestBody Product product) {
        product.setId(null);
        return productService.save(product);
    }

    @PutMapping(path = "/{id}")
    public void update(@PathVariable Long id, Product product) {
        productService.save(product);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }
}
