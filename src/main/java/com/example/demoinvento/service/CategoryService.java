package com.example.demoinvento.service;/*  gaajiCode
    99
    05/01/2025
    */

import com.example.demoinvento.dtos.CategoryDTO;
import com.example.demoinvento.dtos.Response;

public interface CategoryService {
    Response createCategory(CategoryDTO categoryDTO);

    Response getAllCategories();

    Response getCategoryById(Long id);

    Response updateCategory(Long id, CategoryDTO categoryDTO);

    Response deleteCategory(Long id);
}
