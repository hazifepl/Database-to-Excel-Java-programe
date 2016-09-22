package com.mani;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.mani.beans.EmployeeDetails;

public class ReadData {
	public static void main(String[] args) {
		SessionFactory sf = sf = new AnnotationConfiguration().configure("/com/mani/resources/hibernate.cfg.xml").buildSessionFactory();
		String sql ="from EmployeeDetails";
		Session session = sf.openSession();
		Query query = session.createQuery(sql);
		
	      XSSFWorkbook workbook = new XSSFWorkbook(); 
	      XSSFSheet spreadsheet = workbook.createSheet("employe db");
	      XSSFRow row=spreadsheet.createRow(0);
	      XSSFCell cell;
	      cell=row.createCell(0);
	      cell.setCellValue("ID");
	      cell=row.createCell(1);
	      cell.setCellValue("FNAME");
	      cell=row.createCell(2);
	      cell.setCellValue("LNAME");
	      cell=row.createCell(3);
	      cell.setCellValue("dob");
	      cell=row.createCell(4);
	      cell.setCellValue("Designation");
	      cell=row.createCell(5);
	      cell.setCellValue("Emp Status");
	      cell=row.createCell(6);
	      cell.setCellValue("Phone Number");
	      cell=row.createCell(7);
	      cell.setCellValue("E_Mail");
	      cell=row.createCell(8);
	      cell.setCellValue("Door No");
	      cell=row.createCell(9);
	      cell.setCellValue("Street");
	      cell=row.createCell(10);
	      cell.setCellValue("District");
	      cell=row.createCell(11);
	      cell.setCellValue("State");
	      cell=row.createCell(12);
	      cell.setCellValue("Country");
	      cell=row.createCell(13);
	      cell.setCellValue("Bank Id");

		 List<EmployeeDetails> list = query.list();
		 Iterator<EmployeeDetails> itr = list.iterator();
		 int i=1;
		 while(itr.hasNext())
		 {
			 EmployeeDetails emp = (EmployeeDetails) itr.next();
	         row=spreadsheet.createRow(i);
	         cell=row.createCell(0);
	         cell.setCellValue(emp.getId());
	         cell=row.createCell(1);
	         cell.setCellValue(emp.getFname());
	         cell=row.createCell(2);
	         cell.setCellValue(emp.getLname());
	         cell=row.createCell(3);
	         cell.setCellValue(emp.getDob().toString());
	         cell=row.createCell(4);
	         cell.setCellValue(emp.getDesignation());
	         cell=row.createCell(5);
	         cell.setCellValue(emp.getEmpStatus());
	         cell=row.createCell(6);
	         cell.setCellValue(emp.getPhoneNumber());
	         cell=row.createCell(7);
	         cell.setCellValue(emp.getEmai_Id());
	         cell=row.createCell(8);
	         cell.setCellValue(emp.getAddress().getDoorNo());
	         cell=row.createCell(9);
	         cell.setCellValue(emp.getAddress().getStreet());
	         cell=row.createCell(10);
	         cell.setCellValue(emp.getAddress().getDistrict());
	         cell=row.createCell(11);
	         cell.setCellValue(emp.getAddress().getState());
	         cell=row.createCell(12);
	         cell.setCellValue(emp.getAddress().getCountry());
	         cell=row.createCell(13);
	         cell.setCellValue(emp.getBank().getBankid());
	         cell=row.createCell(13);
	         cell.setCellValue(emp.getBank().getBankid());
	         i++;
		 }
	      FileOutputStream out = null;
				try {
					String exepath = "D://exceldata";
					if(exepath.endsWith(".xls") || exepath.endsWith(".xlsx"))
					{
					out = new FileOutputStream (new File(exepath));
					workbook.write(out);
					out.close();
					System.out.println("Executed successfully");
					}else
					{
						String bufpath = exepath.concat(".xlsx");
						out = new FileOutputStream (new File(bufpath));
						workbook.write(out);
						out.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
	}

