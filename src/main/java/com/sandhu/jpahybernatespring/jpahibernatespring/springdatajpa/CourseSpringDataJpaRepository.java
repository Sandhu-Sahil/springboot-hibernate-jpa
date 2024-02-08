package com.sandhu.jpahybernatespring.jpahibernatespring.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandhu.jpahybernatespring.jpahibernatespring.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    List<Course> findByAuthor(String author);
	List<Course> findByName(String name);
}
