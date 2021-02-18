package com.test.jpql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "student")
@Getter
@Setter
public class student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id",  unique = true, nullable = false)
	private int id;
	
	@Column(name = "student_name")
	private String name;
	
	@Column(name = "student_email_1")
	private String email1;
	
	@Column(name = "student_email_2")
	private String email2;
	
	@Column(name = "student_reg_no")
	private String regNo;
	
	@Column(name = "student_contact_no")
	private String contactNo;
	
	@Column(name = "student_detail")
	private String detail;
	
	@Column(name = "student_status")
	private int status; 
	
	@Column(name = "student_batch_id") 
	private String batchId;
	
	@Column(name = "student_group_id")
	private String groupId;
	
	@Column(name = "student_special_id")
	private String specialId;
	
	@Column(name = "student_address")
	private String address;
	
	@Column(name = "student_contact_no_2")
	private String contactNo2;
	
	@Column(name = "student_image_path")
	private String imagePath;
	
	@Column(name = "student_guardian_name")
	private String guardianName;

	@Column(name = "student_guardian_contact_no")
	private String guardianContactNo;

	@Column(name = "student_dob")
	private String dob;

}
