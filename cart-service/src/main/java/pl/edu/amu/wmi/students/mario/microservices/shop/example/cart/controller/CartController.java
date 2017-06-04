package pl.edu.amu.wmi.students.mario.microservices.shop.example.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.cart.domain.Cart;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.cart.httpexceptions.NotFoundException;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.cart.service.CartService;

import java.util.List;

/**
 * Created by Mariusz on 2017-06-04.
 */
@RestController
@RequestMapping("/carts")
public class CartController {

    private CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping
    public List<Cart> findAll() {
        return cartService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Cart findOne(@PathVariable Long id) {
        return cartService.findOne(id).orElseThrow(NotFoundException::new);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cart create(@RequestBody Cart cart) {
        cart.setId(null);
        return cartService.save(cart);
    }

    @PutMapping(path = "/{id}")
    public void update(@PathVariable Long id, Cart cart) {
        cartService.save(cart);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id) {
        cartService.delete(id);
    }
}
