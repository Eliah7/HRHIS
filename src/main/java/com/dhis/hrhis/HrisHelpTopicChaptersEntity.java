package com.dhis.hrhis;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hris_help_topic_chapters", schema = "public", catalog = "hrhis")
public class HrisHelpTopicChaptersEntity {
    private int topicId;
    private int chapterId;

    @Basic
    @Column(name = "topic_id")
    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    @Basic
    @Column(name = "chapter_id")
    public int getChapterId() {
        return chapterId;
    }

    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HrisHelpTopicChaptersEntity that = (HrisHelpTopicChaptersEntity) o;
        return topicId == that.topicId &&
                chapterId == that.chapterId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(topicId, chapterId);
    }
}
