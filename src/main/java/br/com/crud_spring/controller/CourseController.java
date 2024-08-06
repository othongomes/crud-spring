package br.com.crud_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
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


    //@RequestMapping(method = RequestMethod.GET) substituido
    @GetMapping
    public List<Course> list() {
        return courseRepository.findAll();
    }

    /* 

    //@RequestMapping(method = RequestMethod.POST) substituido
    @PostMapping
    public ResponseEntity<Course> create(@RequestBody Course course) {
        //System.out.println(course.getName());
        //return courseRepository.save(course);
        return ResponseEntity.status(HttpStatus.CREATED)
            .body(courseRepository.save(course));
    }
            
    */

    //@RequestMapping(method = RequestMethod.POST) substituido
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Course create(@RequestBody Course course) {
        //System.out.println(course.getName());
        return courseRepository.save(course);
        // return ResponseEntity.status(HttpStatus.CREATED)
        //     .body(courseRepository.save(course));
    }
    
}
