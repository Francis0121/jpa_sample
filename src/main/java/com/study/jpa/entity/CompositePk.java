package com.study.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by francis on 2015. 12. 1..
 */
@Embeddable
public class CompositePk implements Serializable{

    private static final long serialVersionUID = -7795481776154900509L;

    private @Column(name = "pid", nullable = false) Long pid;
    private @Column(name = "uid", nullable = false) Long uid;

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompositePk that = (CompositePk) o;

        if (pid != null ? !pid.equals(that.pid) : that.pid != null) return false;
        return !(uid != null ? !uid.equals(that.uid) : that.uid != null);

    }

    @Override
    public int hashCode() {
        int result = pid != null ? pid.hashCode() : 0;
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CompositePk{");
        sb.append("pid=").append(pid);
        sb.append(", uid=").append(uid);
        sb.append('}');
        return sb.toString();
    }
}
