package com.example.BACKEND_E_C.Service.IMPL;

import com.example.BACKEND_E_C.DTOS.productDtos;
import com.example.BACKEND_E_C.Entity.Product;
import com.example.BACKEND_E_C.Repository.productRepository;
import com.example.BACKEND_E_C.Service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService {

    private final productRepository Prepository;
    @Override
    public List<productDtos> getProduct() {
        return Prepository.findAll()
                .stream().map(this::transformToDTO).collect(Collectors.toList());
    }

    private productDtos transformToDTO(Product product){

        productDtos productDto=new productDtos();
        BeanUtils.copyProperties(product,productDto);
        return productDto;

    }

}
