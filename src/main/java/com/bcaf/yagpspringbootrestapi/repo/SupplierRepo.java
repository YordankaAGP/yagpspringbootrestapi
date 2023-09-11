package com.bcaf.yagpspringbootrestapi.repo;

import com.bcaf.yagpspringbootrestapi.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepo extends JpaRepository<Supplier,Long> {

}

