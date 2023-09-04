package com.bcaf.yagpspringbootrestapi.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ModelX")
public class TugasA {
    @Id
    @Column(name = "IDModelX", columnDefinition = "VARCHAR(30)",nullable = false)
    private String idModelX;
    @Column(name = "Alamat",columnDefinition = "NVARCHAR(255) default 'BELUM DIISI'",nullable = false)
    private String alamat;

    @Column(name = "CreatedBy", columnDefinition = "BIGINT default 0",nullable = false)
    private Long createdBy;

    @Column(name = "CreatedDate", columnDefinition = "DATETIME default GETDATE()",nullable = false)
    private Date createdDate;

    @Column(name = "IsActive", columnDefinition = "SMALLINT")
    private Short isActive;

    @Column(name = "JenisKelamin", columnDefinition = "CHAR(1) default 'P'")
    private Character jenisKelamin;

    @Column(name = "MasihHidup", columnDefinition = "BIT", length = 1)
    private Short masihHidup;

    @Column(name = "ModifiedBy", columnDefinition = "BIGINT")
    private Long modifiedBy;

    @Column(name = "ModifiedDate", columnDefinition = "DATETIME")
    private Date modifiedDate;

    @Column(name = "Nama", columnDefinition = "CHAR(40) default 'SEDANG DIMINTA'")
    private Character nama;

    @Column(name = "TanggalLahir", columnDefinition = "DATE")
    private Date TanggalLahir;
}
