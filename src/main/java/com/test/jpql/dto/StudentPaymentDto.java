package com.test.jpql.dto;

import java.math.BigDecimal;
import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StudentPaymentDto {

	private Object id;
	private Date paymentDate;
	private int studentId;
	private String studentName;
	private BigDecimal paymentAmount;
	
	public StudentPaymentDto(Object id, Date paymentDate, int studentId, String studentName, BigDecimal paymentAmount) {
		this.id = id;
		this.paymentDate = paymentDate;
		this.studentId = studentId;
		this.studentName =studentName;
		this.paymentAmount =paymentAmount;
	}
}
