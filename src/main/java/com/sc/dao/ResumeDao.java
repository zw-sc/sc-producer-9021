package com.sc.dao;


import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import pojo.Resume;

@Registered
public interface ResumeDao extends JpaRepository<Resume, Long> {
}
