package com.bcaf.yagpspringbootrestapi.model;

import com.bcaf.yagpspringbootrestapi.util.ConstantCalonPeserta;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "MstPeserta")
public class CalonPeserta {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @NotNull(message = ConstantCalonPeserta.NAMA_NOT_NULL)
    @NotEmpty(message = ConstantCalonPeserta.NAMA_NOT_EMPTY)
    @Length(min = 5, max = 15,message = ConstantCalonPeserta.NAMA_MIN_MAX)
    @Column(name = "Nama", length = 500, nullable = false)
    private String nama;
    @NotNull(message = ConstantCalonPeserta.NILAI_IS_MANDATORY)
    @Column(name = "Nilai")
    private Integer nilai;
    @NotNull(message = ConstantCalonPeserta.UMUR_IS_MANDATORY)
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
