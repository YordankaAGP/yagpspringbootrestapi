package com.bcaf.yagpspringbootrestapi.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ModelA")
public class ModelA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDModelA")
    private Long idModelA;

    @OneToMany(mappedBy = "modelA")
    private List<ModelB> listModelB;

    @Column(name = "CreatedBy", columnDefinition = "BIGINT default 1",nullable = false)
    private Long createdBy;

    @Column(name = "CreatedDate", columnDefinition = "DATETIME default GETDATE()",nullable = false)
    private Date createdDate;

    @Column(name = "IsActive", columnDefinition = "SMALLINT")
    private Short isActive;

    @Column(name = "ModelA", columnDefinition = "CHAR(20) default 'Default Model A'",nullable = false)
    private Character modelA;

    @Column(name = "ModifiedBy", columnDefinition = "BIGINT")
    private Long modifiedBy;

    @Column(name = "ModifiedDate", columnDefinition = "DATETIME")
    private Date modifiedDate;
}
