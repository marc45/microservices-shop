package pl.edu.amu.wmi.students.mario.microservices.shop.example.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.amu.wmi.students.mario.microservices.shop.example.address.domain.Address;

/**
 * Created by Mariusz on 2017-06-04.
 */
public interface AddressRepository extends JpaRepository<Address, Long> {
}
