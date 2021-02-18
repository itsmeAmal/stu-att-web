package com.test.jpql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.jpql.entity.student;

@Repository
public interface StudentRepository extends JpaRepository<student, Integer> {
 
}
