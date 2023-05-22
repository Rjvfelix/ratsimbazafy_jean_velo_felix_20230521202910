package com.school.management.repositories;

import com.school.management.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("SELECT s FROM Student s INNER JOIN Classe c ON c.id = s.classe.id INNER JOIN Teacher t ON t.id = c.teacher.id WHERE c.name like %?1% OR CONCAT(t.firstName,' ',t.lastName) like %?1%")
    List<Student> search(String search);


}
