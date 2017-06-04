package pl.edu.amu.wmi.students.mario.microservices.shop.example.cart.domain;


import javax.persistence.*;
import java.util.Set;

/**
 * Created by Mariusz on 2017-06-04.
 */
@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true, nullable = false)
    private Long customerId;
    @OneToMany(mappedBy = "cart")
    private Set<CartEntry> entries;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Set<CartEntry> getEntries() {
        return entries;
    }

    public void setEntries(Set<CartEntry> entries) {
        this.entries = entries;
    }
}
