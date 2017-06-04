package pl.edu.amu.wmi.students.mario.microservices.shop.example.address.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.address.domain.Address;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.address.repository.AddressRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by Mariusz on 2017-06-04.
 */
@Service
public class AddressService {

    private AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }


    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    public Optional<Address> findOne(Long id) {
        return Optional.ofNullable(addressRepository.findOne(id));
    }

    public Address save(Address address) {
        return addressRepository.save(address);
    }

    public void delete(Long id) {
        addressRepository.delete(id);
    }
}
