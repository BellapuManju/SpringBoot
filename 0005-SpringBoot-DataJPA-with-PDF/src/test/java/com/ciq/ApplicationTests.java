package com.ciq;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.stream;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.ciq.dao.StudentRepository;
import com.ciq.modal.Student;
import com.ciq.service.Serviceimpl;

@SpringBootTest
class ApplicationTests {
@Autowired
private Serviceimpl serv;
@MockBean
private StudentRepository  sturs;

private List<Student> list;


// @Test
// public void savetest() {
//	 Student st=new Student(55, "Archana", "hydrabad");
//	 when(sturs.save(st)).thenReturn(st);
//	 assertEquals(st, serv.save(st));
// }

//@Test
//public void studentlist() {
//	List<Student> list=new ArrayList<Student>();
//	list.add(new Student(67, "kranth", "hyd"));
//	list.add(new Student(34, "laxman", "kakinada"));
//   when(sturs.findAll()).thenReturn(list);  // mocking
//serv.students();
//}
@Test
public void  getbyid() {
	Student stud=serv.getbyid(1);



}


//@Test
//public Optional<Student> findbyid(int id){
//	return sturs.findById(id);
//	
//}






 
 
	}
    

