package com.bcaf.yagpspringbootrestapi.model;

import javax.persistence.*;

@Entity
@Table(name = "MstPeserta")
public class CalonPeserta {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Nama", length = 500, nullable = false)
    private String nama;
    @Column(name = "Nilai")
    private Integer nilai;
    @Column(name = "Umur")
    private Integer umur;

    public String getNama() {
        return nama;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getNilai() {
        return nilai;
    }

    public void setNilai(Integer nilai) {
        this.nilai = nilai;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }
}
