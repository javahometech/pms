package com.jhome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;

import com.jhome.dao.IProductDao;

@Controller
public class ReportingController {

	@Autowired
	IProductDao dao;

	@RequestMapping(value = "/reporting", method = RequestMethod.GET)
	public void getPage() {

	}

	/*Product Report in PDF*/
	@RequestMapping(value = "/productReportInPDF", method = RequestMethod.GET)
	public View productReport(ModelMap map) {
		map.put("productlist", dao.viewProduct());
		map.put("kamal", "KAMALAKAR");

		return new ProductPdf();
	}

	/* Product Report in excel */
	@RequestMapping(value = "/productReportInExl", method = RequestMethod.GET)
	public View productReport1(ModelMap map) {
		map.put("productlist", dao.viewProduct());

		return new ExcelReport();
	}
}
