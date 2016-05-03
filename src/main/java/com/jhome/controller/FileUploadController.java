package com.jhome.controller;

import java.io.IOException;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jhome.pojo.FileUpload;
import com.jhome.pojo.Product;

@Controller
public class FileUploadController {
	@Autowired
	private HibernateTemplate template;
	private MultipartFile file;

	@RequestMapping(value = "/fileUpload")
	public String browseFile(@ModelAttribute("upload") FileUpload fileUpload) {

		System.out.println("this is file uploadpage ");
		return "fileUpload";
	}

	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public String uploadFile(@ModelAttribute("upload") FileUpload upload,
			@RequestParam("file") MultipartFile file) {

		System.out.println("file upload post method");
		System.out.println(file.getOriginalFilename());

		try {
//			Blob blob = Hibernate.getLobCreator(session).createBlob(file.getInputStream());
//			upload.setContent(blob);
//			template.save(upload);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(file.getName());
		// template.save(upload);
		System.out.println("File success.........");

		String name = file.getOriginalFilename();
		System.out.println(name);
		return "fileUpload";

	}
	
	@RequestMapping(value = "/excelRead")
	public String readExcel(@ModelAttribute("upload") FileUpload fileUpload) {

		System.out.println("this is file uploadpage ");
		return "fileUpload";
	}


	@RequestMapping(value = "/excelRead", method = RequestMethod.POST)
	public String readExcel(
			@ModelAttribute("upload") FileUpload fileUpload,
			@RequestParam("file") MultipartFile file) {
		List<Product> list = new ArrayList<Product>();

		try {
			int i = 1;
			HSSFWorkbook workbook = new HSSFWorkbook(file.getInputStream());
			HSSFSheet excelSheet = workbook.getSheetAt(0);
			while (i < excelSheet.getLastRowNum()) {
				// Creates an object for the product Model
				Product product = new Product();
				// Creates an object representing a single row in excel
				HSSFRow row = excelSheet.getRow(i++);
				// Sets the Read data to the model class
				product.setProductId((int)row.getCell(0).getNumericCellValue());
				product.setProductName((row.getCell(1).getStringCellValue()));
				product.setProductCost((row.getCell(2).getNumericCellValue()));
				product.setQuantity((int)row.getCell(3).getNumericCellValue());
				System.out.println(product.getProductId());
				System.out.println(product.getProductName());
				System.out.println(product.getProductCost());
				System.out.println(product.getQuantity());
				list.add(product);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return  "fileUpload";
	}
}
