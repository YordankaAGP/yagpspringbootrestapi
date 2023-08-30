package com.bcaf.yagpspringbootrestapi.controller;

import com.bcaf.yagpspringbootrestapi.model.CalonPeserta;
import com.bcaf.yagpspringbootrestapi.util.FileUtility;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/permisi")
    public String firstPage() {
        return "welcome";
    }

    @PostMapping("/seleksi")
    public String seleksiCalonPeserta(@RequestBody CalonPeserta calon) {
        if (calon.getNilai() > 80 && calon.getUmur() >= 18 && calon.getUmur() <= 60) {
            return calon.getNama() + " lolos seleksi";
        } else {
            return calon.getNama() + " tidak lolos seleksi";
        }
    }

    @PostMapping("/seleksi2")
    public String seleksiCalonPesertaDua(@RequestParam(value = "nama") String strNama, @RequestParam(value = "umur") Integer intUmur, @RequestParam(value = "nilai") Integer intNilai) {
        if (intNilai > 80 && intUmur >= 18 && intUmur <= 60) {
            return strNama + " lolos seleksi";
        } else {
            return strNama + " tidak lolos seleksi";
        }
    }

    @PostMapping("/seleksi3/{nama}/{umur}/{nilai}")
    public String seleksiCalonPeserta3(@PathVariable(value = "nama") String nama, @PathVariable(value = "umur") Integer umur, @PathVariable(value = "nilai") Double nilai) {
        if (nilai > 80 && umur >= 18 && umur <= 60) {
            return nama + " lolos seleksi";
        } else {
            return nama + " tidak lolos seleksi";
        }
    }

    @PostMapping("/kirim-file")
    public String submitFile(@RequestParam(value = "kiriman") MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        String uploadDir = "user-files/";
        FileUtility.saveFile(uploadDir, fileName, file);
        return "Berhasil mengunggah file " + fileName;
    }
}

