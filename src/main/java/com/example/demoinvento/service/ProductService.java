package com.example.demoinvento.service;/*  gaajiCode
    99
    07/01/2025
    */

import com.example.demoinvento.dtos.ProductDTO;
import com.example.demoinvento.dtos.Response;
import org.springframework.web.multipart.MultipartFile;

public interface ProductService {
    Response saveProduct(ProductDTO productDTO, MultipartFile imageFile);

    Response updateProduct(ProductDTO productDTO, MultipartFile imageFile);

    Response getAllProducts();

    Response getProductById(Long id);

    Response deleteProduct(Long id);

    Response searchProduct(String input);
}
