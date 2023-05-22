package com.school.management.service;

import com.school.management.entities.Student;
import com.school.management.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    public List<Student> findStudentsByClasseOrTeacher(String search){
        return repository.search(search);
    }

    public Page<Student> findStudentsWithPagination(int offset, int pageSize){
        Page<Student> students = repository.findAll(PageRequest.of(offset, pageSize, Sort.by("id").ascending()));
        return  students;
    }
}
