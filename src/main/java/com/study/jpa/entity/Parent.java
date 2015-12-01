package com.study.jpa.entity;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.*;

/**
 * Created by francis on 2015. 12. 1..
 */
@Entity
@Table(name = "parent", catalog = "study")
public class Parent {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private @Column(name = "pid", nullable = false) Long pid;

    private @Column(name = "name", nullable = false) String name;

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Parent{");
        sb.append("pid=").append(pid);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
