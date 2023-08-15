package com.hhtech.cruddemo.dao;


import com.hhtech.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {


    private EntityManager entityManger;
    @Autowired
    public StudentDAOImpl( EntityManager entityManger){
        this.entityManger = entityManger;
    }

    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManger.persist(theStudent);
    }

    @Override
    public Student findFindById(Integer id) {

        return entityManger.find(Student.class,id);
    }

    @Override
    public List<Student> findAll() {


        TypedQuery<Student> getAllStudentdb = entityManger.createQuery("From Student  ",Student.class);
        return getAllStudentdb.getResultList();
    }

    @Override
    public Student findByEmail(String email) {
        TypedQuery<Student> getEmail = entityManger.createQuery("from Student where email=:emialFromUser",Student.class);
        getEmail.setParameter("emialFromUser",email);

        return getEmail.getSingleResult();
    }

    @Override
    public List<Student> findByLastName(String lastName) {

        TypedQuery<Student> getLastName = entityManger.createQuery("from Student  where lastName=:stLastName",Student.class);
        getLastName.setParameter("stLastName",lastName);

        return getLastName.getResultList();
    }


    @Override
    @Transactional
    public void update(Student thestudent) {
        entityManger.merge(thestudent);

    }

    @Override
    @Transactional
    public int updateAllLastname(String lastName) {
        int rowEff = entityManger.createQuery("Update Student  set lastName= :names").setParameter("names",lastName).executeUpdate();

       return rowEff;

    }

    @Override
    @Transactional
    public void remove(Integer id) {
        Student s1 = entityManger.find(Student.class,id);
        if(s1==null){
            System.out.println("We can't find the user id");
        }else{
            entityManger.remove(s1);
        }

    }

    @Override
    @Transactional
   public  int removeAll() {
        int rowDeleted = entityManger.createQuery("Delete from Student").executeUpdate();
        return rowDeleted;
    }


}
