package com.capstone.coursemicroservice.repository;


import com.capstone.coursemicroservice.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {
//    List<Course> findTop5ByOrderByLastAccessedDesc();
}
