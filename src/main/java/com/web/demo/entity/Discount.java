package com.web.demo.entity;
// Generated Jul 5, 2021, 11:28:02 AM by Hibernate Tools 5.0.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * Discount generated by hbm2java
 */
@Entity
@Table(name = "discount", catalog = "megalodondb")
public class Discount implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Id_discount", unique = true, nullable = false)
	private Integer idDiscount;
	@Temporal(TemporalType.DATE)
	@Column(name = "Date_start", length = 10)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateStart;
	@Temporal(TemporalType.DATE)
	@Column(name = "Date_end", length = 10)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateEnd;
	@Column(name = "Value")
	private Integer value;
	@Column(name = "Status")
	private Integer status;
//	private Set<Games> gameses = new HashSet<Games>(0);

	public Discount() {
	}

	public Discount(Date dateStart, Date dateEnd, Integer value, Integer status) {
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.value = value;
		this.status = status;
//		this.gameses = gameses;
	}


	public Integer getIdDiscount() {
		return this.idDiscount;
	}

	public void setIdDiscount(Integer idDiscount) {
		this.idDiscount = idDiscount;
	}


	public Date getDateStart() {
		return this.dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}


	public Date getDateEnd() {
		return this.dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	
	public Integer getValue() {
		return this.value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "discount")
//	public Set<Games> getGameses() {
//		return this.gameses;
//	}
//
//	public void setGameses(Set<Games> gameses) {
//		this.gameses = gameses;
//	}

}
