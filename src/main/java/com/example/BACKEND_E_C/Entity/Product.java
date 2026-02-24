package com.example.BACKEND_E_C.Entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

//@Data
@Getter
@Setter
@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="product_id", nullable = false)
    private Long productId;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name="popularity", nullable = false)
    private Integer popularity;

    @Column(name="image_url")
    private String imageUrl;

    @Column(name="description", nullable = false)
    private String description;

    @Column(name="created_by", nullable = false)
    private String createdBY;

    @Column(name="updated_at")
    private Instant updatedAt;//instance  show the time

    @Column(name="updated_by", nullable = false)
    private String updatedBy;


}
