package com.example.BACKEND_E_C.Repository;


import com.example.BACKEND_E_C.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Optional
public interface productRepository extends JpaRepository<Product,Long> {


}
