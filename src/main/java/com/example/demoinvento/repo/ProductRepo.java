package com.example.demoinvento.repo;/*  gaajiCode
    99
    03/01/2025
    */


import com.example.demoinvento.enitity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Long> {
    List<Product> findByNameContainingOrDescriptionContaining(String name, String description);
}
