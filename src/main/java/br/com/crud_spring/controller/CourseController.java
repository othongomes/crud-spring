package br.com.crud_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.crud_spring.Model.Course;
import br.com.crud_spring.repository.CourseRepository;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor //lombok cria o construtor
public class CourseController {

    //@Autowired (substituido pelo construtor que obriga a injeção da dep.) 
    private final CourseRepository courseRepository;

    // public CourseController(CourseRepository courseRepository) {
    //     this.courseRepository = courseRepository;
    // }



    @GetMapping
    public List<Course> list() {
        return courseRepository.findAll();
    }
    
}
