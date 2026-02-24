package com.example.BACKEND_E_C.Controller;


import com.example.BACKEND_E_C.DTOS.productDtos;
import com.example.BACKEND_E_C.Entity.Product;
import com.example.BACKEND_E_C.Repository.productRepository;
import com.example.BACKEND_E_C.Service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private final IProductService iProductService;

@GetMapping("/users")
    public List<productDtos> getProduct(){
    List<productDtos> productList=iProductService.getProduct();
    return  productList;

}

}
