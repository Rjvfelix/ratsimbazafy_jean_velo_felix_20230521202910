package com.school.management;

import com.school.management.entities.Classe;
import com.school.management.entities.Student;
import com.school.management.entities.Teacher;
import com.school.management.repositories.ClasseRepository;
import com.school.management.repositories.StudentRepository;
import com.school.management.repositories.TeacherRepository;
import com.school.management.security.RsaKeyConfig;
import com.school.management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.List;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyConfig.class)
public class SchoolManagementApplication implements CommandLineRunner {

    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ClasseRepository classeRepository;

    public static void main(String[] args) {
        SpringApplication.run(SchoolManagementApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        /*Teacher t1 = new Teacher(null, "Teacher1", "Teacher");
        Teacher t2 = new Teacher(null, "Teacher2", "Teacher");
        teacherRepository.save(t1);
        teacherRepository.save(t2);

        Classe c1 = new Classe(null, "T1", null, t1);
        Classe c2 = new Classe(null, "T2", null, t2);
        classeRepository.save(c1);
        classeRepository.save(c2);


        Student s1 = new Student(null, "First", "Student On C1", c1);
        Student s2 = new Student(null, "Second", "Student On C2", c2);

        studentRepository.save(s1);
        studentRepository.save(s2);*/

    }
}
