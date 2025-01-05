package com.example.demoinvento.api;/*  gaajiCode
    99
    05/01/2025
    */

import com.example.demoinvento.dtos.CategoryDTO;
import com.example.demoinvento.dtos.Response;
import com.example.demoinvento.service.CategoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v3/category")
@RequiredArgsConstructor
public class CategoryAPI {
    private final CategoryService categoryService;

    @PostMapping("/add")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<Response> createCategory(@RequestBody @Valid CategoryDTO categoryDTO) {
        return ResponseEntity.ok(categoryService.createCategory(categoryDTO));
    }


    @GetMapping("/all")
    public ResponseEntity<Response> getAllCategories() {
        return ResponseEntity.ok(categoryService.getAllCategories());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> getCategoryById(@PathVariable Long id) {
        return ResponseEntity.ok(categoryService.getCategoryById(id));
    }

    @PutMapping("/update/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<Response> updateUser(@PathVariable Long id, @RequestBody @Valid CategoryDTO categoryDTO) {
        return ResponseEntity.ok(categoryService.updateCategory(id, categoryDTO));
    }

    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<Response> deleteCategory(@PathVariable Long id) {
        return ResponseEntity.ok(categoryService.deleteCategory(id));
    }

}
