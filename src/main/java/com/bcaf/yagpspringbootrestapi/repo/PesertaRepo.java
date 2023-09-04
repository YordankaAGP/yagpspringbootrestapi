package com.bcaf.yagpspringbootrestapi.repo;

import com.bcaf.yagpspringbootrestapi.model.CalonPeserta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PesertaRepo extends JpaRepository<CalonPeserta,Integer> {
    public List<CalonPeserta> findBynamaContainsOrNilai(String nm, Integer ni);
    public List<CalonPeserta> findByNamaContains(String n);
}
