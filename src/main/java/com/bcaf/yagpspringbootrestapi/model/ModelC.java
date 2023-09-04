package com.bcaf.yagpspringbootrestapi.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ModelC")
public class ModelC implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDModelC")
    private Long idModelC;

    @ManyToMany
    @JoinTable(name = "MapModelBModelC",
            joinColumns = {@JoinColumn(name = "IDModelC",referencedColumnName = "IDModelC",foreignKey = @ForeignKey(name = "fkMapToModelC"))},
            inverseJoinColumns = {@JoinColumn(name = "IDModelB",referencedColumnName = "IDModelB",foreignKey = @ForeignKey(name = "fkMapToModelB"))},
            uniqueConstraints = @UniqueConstraint(columnNames = {"IDModelC","IDModelB"})
    )
    private List<ModelB> listModelB;

    @Column(name = "CreatedBy", columnDefinition = "BIGINT default 1",nullable = false)
    private Long createdBy;

    @Column(name = "CreatedDate", columnDefinition = "DATETIME default GETDATE()",nullable = false)
    private Date createdDate;

    @Column(name = "IsActive", columnDefinition = "SMALLINT")
    private Short isActive;

    @Column(name = "ModelC", columnDefinition = "CHAR(25) default 'Default Model C'",nullable = false)
    private Character modelC;

    @Column(name = "ModifiedBy", columnDefinition = "BIGINT")
    private Long modifiedBy;

    @Column(name = "ModifiedDate", columnDefinition = "DATETIME")
    private Date modifiedDate;
}
