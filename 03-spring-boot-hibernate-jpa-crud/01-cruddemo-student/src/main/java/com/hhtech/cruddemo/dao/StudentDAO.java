package com.hhtech.cruddemo.dao;

import com.hhtech.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);
    Student findFindById(Integer id);
    List<Student>findAll();

    Student findByEmail(String email);
    List<Student> findByLastName(String lastName);

    void update(Student thestudent);

     int updateAllLastname(String lastName);

    void remove(Integer id);
    int removeAll();


}
