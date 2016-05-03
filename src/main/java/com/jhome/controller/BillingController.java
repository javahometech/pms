package com.jhome.controller;

import javax.validation.Valid;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jhome.dao.IBillDao;
import com.jhome.pojo.Billing;

@Controller
public class BillingController {
	Logger logger = Logger.getLogger(BillingController.class);

	@Autowired
	IBillDao billDao;

	@RequestMapping(value = "/billing")
	public String billing(@ModelAttribute("bill") Billing billing) {
		logger.debug("*****************************");
		logger.setLevel(Level.INFO);
		System.out.println("this is billing() method in BillingController ");
		logger.warn(".....................................................");
		return "billing";

	}

	@RequestMapping(value = "/billing", method = RequestMethod.POST)
	public String billPrint(@Valid @ModelAttribute("bill") Billing billing,
			BindingResult result, ModelMap map) {
		if (result.hasErrors()) {

			return "billing";
		}
		logger.debug("billing message.....................");
		map.put("Bill", billDao.billSaveAndGet(billing));

		System.out.println("this is billing() method in BillingController ");
		return "billPrint";

	}

}
