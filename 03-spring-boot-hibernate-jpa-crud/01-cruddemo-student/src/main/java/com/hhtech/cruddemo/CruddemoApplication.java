package com.hhtech.cruddemo;

import com.hhtech.cruddemo.dao.StudentDAO;
import com.hhtech.cruddemo.dao.StudentDAOImpl;
import com.hhtech.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {SpringApplication.run(CruddemoApplication.class, args);}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){

	return runner ->{
//		createStudent(studentDAO);
		createMultipleStudents(studentDAO);
//		readStudent(studentDAO);
//		getAllStudent(studentDAO);
		//findByEmail(studentDAO);
//		findByLstName(studentDAO);
//		updateStudent(studentDAO);
//		removeUser(studentDAO);
//		removeEveryting(studentDAO);
//		updateAllLastname(studentDAO);



	};

	}

	private void updateAllLastname(StudentDAO studentDAO) {
		studentDAO.updateAllLastname("Good");
	}

	private void removeEveryting(StudentDAO studentDAO) {

		System.out.println("Number of rows that was effacted "+studentDAO.removeAll());
	}

	private void removeUser(StudentDAO studentDAO) {
		studentDAO.remove(2);
	}

	private void updateStudent(StudentDAO studentDAO) {

		int id =1;

		Student s1 = studentDAO.findFindById(id);
		s1.setLastName("AliBaba");
		studentDAO.update(s1);

		System.out.println("Value updated "+ s1);
	}

	private void findByLstName(StudentDAO studentDAO) {

		System.out.println(studentDAO.findByLastName("Hussein"));
	}

	private void findByEmail(StudentDAO studentDAO) {

		System.out.println(studentDAO.findByEmail("Ali3Ahmed3@yahoo.com"));

	}

	private void getAllStudent(StudentDAO studentDAO) {

		List<Student> getList = studentDAO.findAll();
		for(Student a : getList){
			System.out.println("Id :"+a.getId());
			System.out.println("First name :"+a.getFirstName());
			System.out.println("Last name :"+a.getLastName());
			System.out.println("Email :"+a.getEmail());
			System.out.println();
		}

	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		Student s1 = new Student("Ali", "omar", "AliOmar@yahoo.com");
		Student s2 = new Student("kassem", "ahmed", "KassemAhmed@yahoo.com");
		Student s3 = new Student("oday", "Akram", "OdayAkram@yahoo.com");

		studentDAO.save(s1);
		studentDAO.save(s2);
		studentDAO.save(s3);
	}

	private void createStudent(StudentDAO studentDAO) {

		System.out.println("Creating new student object ...");

		Student s1 = new Student("Hisham","Hussein","hshmhussin@gmail.com");

		System.out.println("Adding student to the database ...");
		studentDAO.save(s1);

		System.out.println("Saved student. Generate id: "+s1.getId());

	}

	private void readStudent(StudentDAO studentDAO){
		System.out.println("Finding the student");
		Student findStudent = new Student();
		findStudent = studentDAO.findFindById(5);

		if(findStudent == null){
			System.out.println("The user you are trying to find is not found ");
		}else{
			System.out.println(findStudent);
		}



	}
}