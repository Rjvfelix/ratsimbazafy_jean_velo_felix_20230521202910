package com.school.management.controller;

import com.school.management.entities.Student;
import com.school.management.repositories.StudentRepository;
import com.school.management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentContoller {
    @Autowired
    private StudentService service;
    @GetMapping("/students")
    List<Student> all() {
        return service.findAllStudents();
    }

    @GetMapping("/students/search/{search}")
    List<Student> query(@PathVariable String search) {
        return service.findStudentsByClasseOrTeacher(search);
    }

    @GetMapping("/students/pagination/{offset}/{pageSize}")
    private List<Student> getStudentsBySize(@PathVariable int offset, @PathVariable int pageSize){
        return service.findStudentsWithPagination(offset, pageSize).getContent();
    }
}
