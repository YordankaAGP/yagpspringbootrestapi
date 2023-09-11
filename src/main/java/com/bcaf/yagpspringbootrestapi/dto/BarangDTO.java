package com.bcaf.yagpspringbootrestapi.dto;

import com.bcaf.yagpspringbootrestapi.model.KategoriBarang;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class BarangDTO {

    private Long idBarang;

    @NotNull(message = "Field Nama Barang Tidak Boleh Null")
    @NotBlank(message = "Field Nama Barang Tidak Boleh Blank")
    @NotEmpty(message = "Field Nama Barang Tidak Boleh Kosong")
    @Length(min = 5,max = 25,message = "Field Nama Barang Min 5 Maks 25 Karakter")
    private String namaBarang;
    private String deskripsi ;
    private KategoriBarang kategoriBarang;

    public Long getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(Long idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public KategoriBarang getKategoriBarang() {
        return kategoriBarang;
    }

    public void setKategoriBarang(KategoriBarang kategoriBarang) {
        this.kategoriBarang = kategoriBarang;
    }
}

