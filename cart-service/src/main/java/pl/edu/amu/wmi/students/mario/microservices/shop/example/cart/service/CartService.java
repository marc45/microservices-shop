package pl.edu.amu.wmi.students.mario.microservices.shop.example.cart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.cart.domain.Cart;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.cart.repository.CartRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by Mariusz on 2017-06-04.
 */
@Service
public class CartService {

    private CartRepository cartRepository;

    @Autowired
    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }


    public List<Cart> findAll() {
        return cartRepository.findAll();
    }

    public Optional<Cart> findOne(Long id) {
        return Optional.ofNullable(cartRepository.findOne(id));
    }

    public Cart save(Cart cart) {
        return cartRepository.save(cart);
    }

    public void delete(Long id) {
        cartRepository.delete(id);
    }
}
