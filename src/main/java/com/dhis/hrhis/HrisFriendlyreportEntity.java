package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "hris_friendlyreport", schema = "public", catalog = "hrhis")
public class HrisFriendlyreportEntity {
    private int id;
    private Integer seriesId;
    private String uid;
    private String name;
    private String description;
    private int sort;
    private Boolean ignoreskipinreport;
    private Boolean usetargets;
    private Boolean showdeficitsurplus;
    private Timestamp datecreated;
    private Timestamp lastupdated;
    private String type;
    private String sql;
    private String javascript;
    private String stylesheet;

    @Basic
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "series_id")
    public Integer getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    @Basic
    @Column(name = "uid")
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "sort")
    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    @Basic
    @Column(name = "ignoreskipinreport")
    public Boolean getIgnoreskipinreport() {
        return ignoreskipinreport;
    }

    public void setIgnoreskipinreport(Boolean ignoreskipinreport) {
        this.ignoreskipinreport = ignoreskipinreport;
    }

    @Basic
    @Column(name = "usetargets")
    public Boolean getUsetargets() {
        return usetargets;
    }

    public void setUsetargets(Boolean usetargets) {
        this.usetargets = usetargets;
    }

    @Basic
    @Column(name = "showdeficitsurplus")
    public Boolean getShowdeficitsurplus() {
        return showdeficitsurplus;
    }

    public void setShowdeficitsurplus(Boolean showdeficitsurplus) {
        this.showdeficitsurplus = showdeficitsurplus;
    }

    @Basic
    @Column(name = "datecreated")
    public Timestamp getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Timestamp datecreated) {
        this.datecreated = datecreated;
    }

    @Basic
    @Column(name = "lastupdated")
    public Timestamp getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(Timestamp lastupdated) {
        this.lastupdated = lastupdated;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "sql")
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    @Basic
    @Column(name = "javascript")
    public String getJavascript() {
        return javascript;
    }

    public void setJavascript(String javascript) {
        this.javascript = javascript;
    }

    @Basic
    @Column(name = "stylesheet")
    public String getStylesheet() {
        return stylesheet;
    }

    public void setStylesheet(String stylesheet) {
        this.stylesheet = stylesheet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisFriendlyreportEntity that = (HrisFriendlyreportEntity) o;
        return id == that.id &&
                sort == that.sort &&
                Objects.equals(seriesId, that.seriesId) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(ignoreskipinreport, that.ignoreskipinreport) &&
                Objects.equals(usetargets, that.usetargets) &&
                Objects.equals(showdeficitsurplus, that.showdeficitsurplus) &&
                Objects.equals(datecreated, that.datecreated) &&
                Objects.equals(lastupdated, that.lastupdated) &&
                Objects.equals(type, that.type) &&
                Objects.equals(sql, that.sql) &&
                Objects.equals(javascript, that.javascript) &&
                Objects.equals(stylesheet, that.stylesheet);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, seriesId, uid, name, description, sort, ignoreskipinreport, usetargets, showdeficitsurplus, datecreated, lastupdated, type, sql, javascript, stylesheet);
    }
}
