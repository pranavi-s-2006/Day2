package com.example.studentcrud1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentcrud1.entity.Student;


public interface StudentRepository extends JpaRepository < Student ,Long> {

}
