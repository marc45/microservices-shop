package pl.edu.amu.wmi.students.mario.microservices.shop.example.order.domain;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * Created by Mariusz on 2017-06-04.
 */
@Entity(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private Long customerId;
    @OneToMany(mappedBy = "order")
    private Set<OrderEntry> entries;
    @Column(nullable = false)
    private LocalDateTime creationTime = LocalDateTime.now();
    @Column(nullable = false)
    private OrderStatus status = OrderStatus.CREATED;
    @Column
    private double discount;
    @Column
    private Long addressId;
    @Column(columnDefinition = "TEXT")
    private String additionalMessage;

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

    public Set<OrderEntry> getEntries() {
        return entries;
    }

    public void setEntries(Set<OrderEntry> entries) {
        this.entries = entries;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getAdditionalMessage() {
        return additionalMessage;
    }

    public void setAdditionalMessage(String additionalMessage) {
        this.additionalMessage = additionalMessage;
    }

}
