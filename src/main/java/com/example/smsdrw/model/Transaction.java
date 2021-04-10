package com.example.smsdrw.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Transient;


import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@ApiModelProperty(required = false, hidden = true)
	private Long id;
	private String name;
	private Float money;
	private Date date = new Date();
	
	@OneToOne
	@JoinColumn(name="category_id")
	private Category category;
	
	@Transient
	private Long category_id;
	
	@ManyToOne
	@JoinColumn(name="bank_account_id")
	private BankAccount bankAccount;
	
	@Transient
	private Long bank_account_id;
	
	@Column(insertable = false, updatable = false)
	private String type;
}
