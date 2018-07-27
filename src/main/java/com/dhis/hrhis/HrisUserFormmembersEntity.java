package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_user_formmembers", schema = "public", catalog = "hrhis")
public class HrisUserFormmembersEntity {
    private int userId;
    private int formId;

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "form_id")
    public int getFormId() {
        return formId;
    }

    public void setFormId(int formId) {
        this.formId = formId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisUserFormmembersEntity that = (HrisUserFormmembersEntity) o;
        return userId == that.userId &&
                formId == that.formId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(userId, formId);
    }
}
