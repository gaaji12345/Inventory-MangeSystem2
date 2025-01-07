package com.example.demoinvento.service;/*  gaajiCode
    99
    05/01/2025
    */

import com.example.demoinvento.dtos.Response;
import com.example.demoinvento.dtos.SupplierDTO;

public interface SupplierService {
    Response addSupplier(SupplierDTO supplierDTO);

    Response updateSupplier(Long id, SupplierDTO supplierDTO);

    Response getAllSupplier();

    Response getSupplierById(Long id);

    Response deleteSupplier(Long id);
}
