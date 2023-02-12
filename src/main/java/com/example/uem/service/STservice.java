package com.example.uem.service;

import com.example.uem.model.Student;
import com.example.uem.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class STservice {
    @Autowired
    StudentRepo studentRepo;
    public void addSt(Student student) {
        studentRepo.save(student);
    }

    public List<Student> getall() {
        return studentRepo.findAll();
    }

    public Student getbyid(int id) {
      return studentRepo.findById(id).get();
    }

    public void update(int id, Student newstudent) {
       Student  st = studentRepo.findById(id).get();
       st.setStudentId(newstudent.getStudentId());
       st.setFName(newstudent.getFName());
       st.setLName(newstudent.getLName());
       st.setAge(newstudent.getAge());
       st.setDep(newstudent.getDep());
       studentRepo.save(st);
    }

    public void delete(int id) {
        studentRepo.deleteById(id);
    }


}
