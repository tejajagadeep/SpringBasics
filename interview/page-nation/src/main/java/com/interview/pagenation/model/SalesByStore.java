package com.interview.pagenation.model;

// Generated 20/10/2012 11:23:03 AM by Hibernate Tools 3.4.0.CR1

import jakarta.persistence.*;

/**
 * SalesByStore generated by hbm2java
 */
@Entity
@Table(name = "sales_by_store", catalog = "sakila")
public class SalesByStore implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private SalesByStoreId id;

    public SalesByStore() {
    }

    public SalesByStore(SalesByStoreId id) {
        this.id = id;
    }

    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "store", column = @Column(name = "store", length = 101)),
            @AttributeOverride(name = "manager", column = @Column(name = "manager", length = 91)),
            @AttributeOverride(name = "totalSales", column = @Column(name = "total_sales", precision = 27))})
    public SalesByStoreId getId() {
        return this.id;
    }

    public void setId(SalesByStoreId id) {
        this.id = id;
    }

}
