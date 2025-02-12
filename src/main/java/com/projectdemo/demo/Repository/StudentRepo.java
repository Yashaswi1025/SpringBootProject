package com.projectdemo.demo.Repository;

import com.projectdemo.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
