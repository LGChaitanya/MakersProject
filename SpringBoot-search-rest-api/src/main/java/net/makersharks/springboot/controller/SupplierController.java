package net.makersharks.springboot.controller;

import net.makersharks.springboot.entity.ManufacturingProcess;
import net.makersharks.springboot.entity.NatureOfBusiness;
import net.makersharks.springboot.entity.Supplier;
import net.makersharks.springboot.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    private final SupplierService supplierService;

    @Autowired
    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @PostMapping("/query")
    public List<Supplier> querySuppliers (@RequestParam String location,
                                         @RequestParam NatureOfBusiness natureOfBusiness,
                                         @RequestParam ManufacturingProcess manufacturingProcess) {
        return supplierService.querySuppliers(location, natureOfBusiness, manufacturingProcess);
    }

}