package ru.rogoff.webservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.rogoff.webservice.model.Student;

@RestController
public class StudentController {

    @GetMapping("/first/{id}")
    public Student getStudentById(@PathVariable("id") Long id) {
        if (id == 123) {
            return new Student(id, "John Doe", "Computer Science");
        }
        return null;
    }
}
