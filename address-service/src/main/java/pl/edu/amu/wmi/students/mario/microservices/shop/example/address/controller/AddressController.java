package pl.edu.amu.wmi.students.mario.microservices.shop.example.address.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.address.domain.Address;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.address.httpexceptions.NotFoundException;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.address.service.AddressService;

import java.util.List;

/**
 * Created by Mariusz on 2017-06-04.
 */
@RestController
@RequestMapping("/addresses")
public class AddressController {

    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public List<Address> findAll() {
        return addressService.findAll();
    }

    @GetMapping(path = "/{id}")
    public Address findOne(@PathVariable Long id) {
        return addressService.findOne(id).orElseThrow(NotFoundException::new);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Address create(@RequestBody Address address) {
        address.setId(null);
        return addressService.save(address);
    }

    @PutMapping(path = "/{id}")
    public void update(@PathVariable Long id, Address address) {
        addressService.save(address);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id) {
        addressService.delete(id);
    }
}
