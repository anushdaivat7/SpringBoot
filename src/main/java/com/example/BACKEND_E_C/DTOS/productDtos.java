package com.example.BACKEND_E_C.DTOS;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter

public class productDtos {

private Long productId;
private String name;
private String description;
private BigDecimal price;
private  String imageUrl;
private Instant createdAt;

}
