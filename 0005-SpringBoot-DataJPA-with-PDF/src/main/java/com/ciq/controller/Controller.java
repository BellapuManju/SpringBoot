package com.ciq.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ciq.modal.Student;
import com.ciq.pdf.PdfServiceview;
import com.ciq.service.Serviceimpl;
import com.lowagie.text.DocumentException;

@RestController
public class Controller {
	@Autowired
	    private Serviceimpl serv;
	
//	@GetMapping("/hel")
//	public String name() {
//		return "Home";
//	}
	
	@GetMapping("/sa")
	public ModelAndView save() {
		return new ModelAndView("insert");
	}
	
	@PostMapping("/insert")
	public ModelAndView saved(Student student) {
		serv.save(student);
	return new ModelAndView("redirect:all");
	}
	
	@GetMapping("/all")
	public ModelAndView findall(Student student) {
		List<Student> stu=serv.students();
		return new ModelAndView("findall","swa",stu);
	}
	
	
	
	@GetMapping("/up")
	public ModelAndView getbyid(int id) {
		Student ta = serv.findbyid(id);
		return new ModelAndView("update","As",ta);	
		}
	
	@PostMapping("/update")
	public ModelAndView update(Student student) {
		serv.save(student);
		return new ModelAndView("redirect:all");	
	}
	
	@GetMapping("/delete")
	public ModelAndView delete(int id) {
			serv.delete(id);
	return new ModelAndView("redirect:all");
		}
	
	@GetMapping("/studentpdf")
	public void exportToPDF(HttpServletResponse response) throws DocumentException, IOException {
		response.setContentType("application/pdf");
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
		String currentDateTime = dateFormatter.format(new Date());

		String headerKey = "Content-Disposition";
		String headerValue = "attachment; filename=Student_" + currentDateTime + ".pdf";
		response.setHeader(headerKey, headerValue);

		List<Student> listEmp = serv.students();

		PdfServiceview list = new PdfServiceview(listEmp);
		list.export(response);

}
}