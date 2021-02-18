package com.test.jpql.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "payment")
@Getter
@Setter
public class payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "payment_id")
	private int id;
	
	@Column(name = "payment_student_id")
	private int studentId;
	
	@Column(name = "payment_is_monthly_payment")
	private int isMonthlyPayment;
	
	@Column(name = "payment_amount")
	private BigDecimal amount;
	
	@Column(name = "payment_for_year")
	private String paymentYear;
	
	@Column(name = "payment_for_month")
	private String paymentMonth;
	
	@Column(name = "payment_date")
	private Timestamp dateTime;
	
	@Column(name = "payment_class")
	private String paymentClass;
	
	@Column(name = "payment_status")
	private int status;
	
	@Column(name = "payment_detail")
	private String detail;
	
	@Column(name = "payment_subject_id")
	private int subjectId;
	
	@Column(name = "payment_subject_name")
	private String subjecName;
	
	@Column(name = "payment_lecturer_id")
	private int lecturerId;
	
	@Column(name = "payment_lecturer_name")
	private String lecturerName;
	
}
