package net.makersharks.springboot.repository;
import net.makersharks.springboot.entity.ManufacturingProcess;
import net.makersharks.springboot.entity.NatureOfBusiness;
import net.makersharks.springboot.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    List<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesContains(
            String location,
            NatureOfBusiness natureOfBusiness,
            ManufacturingProcess manufacturingProcess
    );
}







