package com.ciq.pdf;

import java.awt.Color;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.ciq.modal.Student;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfCell;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class PdfServiceview {
 private List<Student> liststudents;
 
 public PdfServiceview(List<Student> liststudents) {
	 this.liststudents=liststudents;
 }
 private void writeTableHeader(PdfPTable table) {
	 PdfPCell cell=new PdfPCell();
	 cell.setBackgroundColor(Color.GRAY);
	 cell.setPadding(5);
	 
	 Font font=FontFactory.getFont(FontFactory.HELVETICA);
	 font.setColor(Color.white);
	 cell.setPhrase(new Phrase("Student id",font));
	 table.addCell(cell);
	 cell.setPhrase(new Phrase("Student name",font));
	 table.addCell(cell);
	 cell.setPhrase(new Phrase("Student location",font));
	 table.addCell(cell);
 }
	 private void writeTableData(PdfPTable table) {
		 for(Student s:liststudents) {
			table.addCell(String.valueOf(s.getId()));
		 table.addCell(s.getName());
		 table.addCell(s.getLocation());
	 }
 }
	 public void export(HttpServletResponse response) throws DocumentException, IOException {
		 Document d=new Document(PageSize.A4);
		 PdfWriter.getInstance(d, response.getOutputStream());
		 d.open();
		 Font font=FontFactory.getFont(FontFactory.COURIER_BOLD);
		 font.setSize(18);
		 font.setColor(Color.blue);
		 Paragraph p=new Paragraph("List of Students", font);
		 p.setAlignment(Paragraph.ALIGN_CENTER);
		 d.add(p);
		 PdfPTable table=new PdfPTable(3);
		 table.setWidthPercentage(100f);
		 table.setWidths(new float[] {1.5f,3.5f,3.0f});
		 table.setSpacingBefore(10);
		  writeTableHeader(table);
		  writeTableData(table);
		  d.add(table);
		  d.close();
		  
	 }
}
