package com.jhome.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.jhome.pojo.Product;

public class ExcelReport extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model,
			HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String name = (String) model.get("kamal");
		System.out.println("This statement from Excel report class " + name);

		List list = (List) model.get("productlist");
		HSSFSheet sheet = workbook.createSheet("ProductReport.xls");

		HSSFRow header = sheet.createRow(0);
		header.createCell(0).setCellValue("ProductId");
		header.createCell(1).setCellValue("ProductName");
		header.createCell(2).setCellValue("ProductCost");
		header.createCell(3).setCellValue("Quantity");

		int rowNum = 1;

		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Product product = (Product) iterator.next();
			HSSFRow row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(product.getProductId());
			row.createCell(1).setCellValue(product.getProductName());
			row.createCell(2).setCellValue(product.getProductCost());
			row.createCell(3).setCellValue(product.getQuantity());

		}

	}

}
