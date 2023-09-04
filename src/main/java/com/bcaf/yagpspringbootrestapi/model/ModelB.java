package com.bcaf.yagpspringbootrestapi.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ModelB")
public class ModelB implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDModelB")
    private Long idModelB;

    @ManyToOne
    @JoinColumn(name = "IDModelA", foreignKey = @ForeignKey(name = "fk_modelB_modelA", foreignKeyDefinition = "FOREIGN KEY ([IDModelA]) REFERENCES [ModelA] ([IDModelA]) ON DELETE SET NULL ON UPDATE SET NULL"))
    private ModelA modelA;

    @ManyToMany(mappedBy = "listModelB")
    private List<ModelC> listModelC;

    @Column(name = "CreatedBy", columnDefinition = "BIGINT default 1",nullable = false)
    private Long createdBy;

    @Column(name = "CreatedDate", columnDefinition = "DATETIME default GETDATE()",nullable = false)
    private Date createdDate;

    @Column(name = "IsActive", columnDefinition = "SMALLINT")
    private Short isActive;

    @Column(name = "ModelB", columnDefinition = "CHAR(30) default 'Default Model B'",nullable = false)
    private Character modelB;

    @Column(name = "ModifiedBy", columnDefinition = "BIGINT")
    private Long modifiedBy;

    @Column(name = "ModifiedDate", columnDefinition = "DATETIME")
    private Date modifiedDate;
}
