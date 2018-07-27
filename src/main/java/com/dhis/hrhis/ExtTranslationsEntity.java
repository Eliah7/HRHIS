package com.dhis.hrhis;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ext_translations", schema = "public", catalog = "hrhis")
public class ExtTranslationsEntity {
    private int id;
    private String locale;
    private String objectClass;
    private String field;
    private String foreignKey;
    private String content;

    @Basic
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "locale")
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    @Basic
    @Column(name = "object_class")
    public String getObjectClass() {
        return objectClass;
    }

    public void setObjectClass(String objectClass) {
        this.objectClass = objectClass;
    }

    @Basic
    @Column(name = "field")
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Basic
    @Column(name = "foreign_key")
    public String getForeignKey() {
        return foreignKey;
    }

    public void setForeignKey(String foreignKey) {
        this.foreignKey = foreignKey;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExtTranslationsEntity that = (ExtTranslationsEntity) o;
        return id == that.id &&
                Objects.equals(locale, that.locale) &&
                Objects.equals(objectClass, that.objectClass) &&
                Objects.equals(field, that.field) &&
                Objects.equals(foreignKey, that.foreignKey) &&
                Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, locale, objectClass, field, foreignKey, content);
    }
}
