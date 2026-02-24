package com.example.BACKEND_E_C.Service;

import com.example.BACKEND_E_C.DTOS.productDtos;
import com.example.BACKEND_E_C.Entity.Product;

import java.util.List;

public interface IProductService {

    List<productDtos> getProduct();

}
