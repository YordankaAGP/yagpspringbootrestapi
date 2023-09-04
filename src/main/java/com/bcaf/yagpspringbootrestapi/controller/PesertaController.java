package com.bcaf.yagpspringbootrestapi.controller;

import com.bcaf.yagpspringbootrestapi.model.CalonPeserta;
import com.bcaf.yagpspringbootrestapi.repo.PesertaRepo;
import com.bcaf.yagpspringbootrestapi.services.PesertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/peserta/")
public class PesertaController {

    @Autowired
    PesertaRepo pesertaRepo;

    @Autowired
    PesertaService pesertaService;

    @GetMapping("/")
    public List<CalonPeserta> getAllData() {
        List<CalonPeserta> daftarPeserta = pesertaRepo.findAll();
        return daftarPeserta;
    }

    @PostMapping("/")
    public String postData(@Valid @RequestBody CalonPeserta peserta) {
        pesertaService.save(peserta);
        return peserta.getNama() + " berhasil ditambahkan";
    }

    @GetMapping("/search-peserta-by-id")
    public Map<String,Object> searchPesertaById(@RequestParam(value = "id") Integer id) {
        Optional<CalonPeserta> hasil = pesertaRepo.findById(id);
        Map<String,Object> m = new HashMap<>();
        if(hasil.isEmpty())
        {
            m.put("message","Data tidak ada");
            return m;
        }
        m.put("data",hasil.get());
        m.put("message","Data ditemukan");
        return m;
    }

    @GetMapping("/search-peserta-by-nama")
    public Map<String,Object> searchPesertaByNama(
            @RequestParam(value = "nama") String nama,
            @RequestParam(value = "nilai") Integer nilai
    ) {
        List<CalonPeserta> hasil = pesertaRepo.findBynamaContainsOrNilai(nama,nilai);
        Map<String,Object> m = new HashMap<>();
        if(hasil.isEmpty())
        {
            m.put("message","Data tidak ada");
            return m;
        }
        m.put("data",hasil);
        m.put("message","Data ditemukan");
        System.out.println("OK");
        return m;
    }

    @GetMapping("/search-peserta-by-nama-sw")
    public Map<String,Object> searchPesertaByNameSW(
            @RequestParam(value = "nama") String nama
    ) {
        List<CalonPeserta> hasil = pesertaRepo.findByNamaContains(nama);
        Map<String,Object> m = new HashMap<>();
        if(hasil.isEmpty())
        {
            m.put("message","Data tidak ada");
            return m;
        }
        m.put("data",hasil);
        m.put("message","Data ditemukan");
        return m;
    }
}

