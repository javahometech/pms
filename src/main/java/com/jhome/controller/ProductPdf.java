package com.jhome.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.jhome.pojo.Product;
import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class ProductPdf extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document doc,
			PdfWriter writer, HttpServletRequest request,
			HttpServletResponse responce) throws Exception {

		List list = (List) model.get("productlist");
		PdfPTable table = new PdfPTable(4);
		table.addCell("ProductId");
		table.addCell("ProductName");
		table.addCell("ProductCost");
		table.addCell("Quantity");
		for (Object object : list) {
			Product product = (Product) object;
			table.addCell(product.getProductId() + "");
			table.addCell(product.getProductName());
			table.addCell(product.getProductCost() + "");
			table.addCell(product.getQuantity() + "");
		}
		doc.add(table);
		doc.close();
	}

}
