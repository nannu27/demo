package com.example.demo.modal;

import jakarta.persistence.*;

@Entity
@Table(name = "excel_data")
public class ExcelData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  String msn;

    @Column(name = "product_name")
    private  String productName;
    @Column(name = "taxonomy_code")
    private  String taxonomyCode;

    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTaxonomy_cod() {
        return taxonomyCode;
    }

    public void setTaxonomy_cod(String taxonomy_cod) {
        this.taxonomyCode = taxonomy_cod;
    }
}
