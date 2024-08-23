package net.makersharks.springboot.service;

import net.makersharks.springboot.entity.ManufacturingProcess;
import net.makersharks.springboot.entity.NatureOfBusiness;
import net.makersharks.springboot.entity.Supplier;
import net.makersharks.springboot.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service

public class SupplierService {

    private final SupplierRepository supplierRepository;
    @Autowired
    public SupplierService(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }


    public List<Supplier> querySuppliers(String location, NatureOfBusiness natureOfBusiness, ManufacturingProcess manufacturingProcess) {
        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesContains(location, natureOfBusiness, manufacturingProcess);
    }
}

