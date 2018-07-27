package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_user_group_members", schema = "public", catalog = "hrhis")
public class HrisUserGroupMembersEntity {
    private int userId;
    private int groupId;

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "group_id")
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisUserGroupMembersEntity that = (HrisUserGroupMembersEntity) o;
        return userId == that.userId &&
                groupId == that.groupId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(userId, groupId);
    }
}
