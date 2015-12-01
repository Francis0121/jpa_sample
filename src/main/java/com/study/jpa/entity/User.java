package com.study.jpa.entity;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by francis on 2015. 12. 1..
 */
@Entity
@Table(name = "user", catalog = "study")
public class User {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private @Column(name = "uid", nullable = false) Long uid;

	private @Column(name = "name", nullable = false) String name;

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("User{");
		sb.append("uid=").append(uid);
		sb.append(", name='").append(name).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
