package com.test.testCrud.CRUD.Test.repositories;

import com.test.testCrud.CRUD.Test.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
}
