package br.com.crud_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.crud_spring.Model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

    

} 
