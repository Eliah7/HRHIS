package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "_temp", schema = "public", catalog = "hrhis")
public class TempEntity {
    private Integer sn;
    private String formula;
    private String title;
    private Double total;

    @Basic
    @Column(name = "sn")
    public Integer getSn() {
        return sn;
    }

    public void setSn(Integer sn) {
        this.sn = sn;
    }

    @Basic
    @Column(name = "formula")
    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "total")
    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TempEntity that = (TempEntity) o;
        return Objects.equals(sn, that.sn) &&
                Objects.equals(formula, that.formula) &&
                Objects.equals(title, that.title) &&
                Objects.equals(total, that.total);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sn, formula, title, total);
    }
}
