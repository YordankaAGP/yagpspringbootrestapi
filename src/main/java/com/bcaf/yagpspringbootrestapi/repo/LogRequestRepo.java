package com.bcaf.yagpspringbootrestapi.repo;

import com.bcaf.yagpspringbootrestapi.model.LogRequest;
import org.springframework.data.repository.CrudRepository;

/*
    Pakai CrudRepository karena table ini hanya untuk insert request yang menyebabkanan ERROR !!
 */
public interface LogRequestRepo extends CrudRepository<LogRequest,Long> {

}
