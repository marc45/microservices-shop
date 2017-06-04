package pl.edu.amu.wmi.students.mario.microservices.shop.example.order.domain;

import javax.persistence.*;

/**
 * Created by Mariusz on 2017-06-04.
 */
@Entity
public class OrderEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Order order;
    @Column(nullable = false)
    private Long productId;
    @Column
    private int pieces;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }
}
