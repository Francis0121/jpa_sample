package com.study.jpa.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by francis on 2015. 12. 1..
 */
@Entity
@Table(name = "composite", catalog = "study")
public class Composite {

	private @EmbeddedId CompositePk compositePk;

	private @Column(name = "date") Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public CompositePk getCompositePk() {
		return compositePk;
	}

	public void setCompositePk(CompositePk compositePk) {
		this.compositePk = compositePk;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Composite{");
		sb.append("compositePk=").append(compositePk);
		sb.append(", date=").append(date);
		sb.append('}');
		return sb.toString();
	}
}
