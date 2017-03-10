package com.milk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.milk.bean.SuplierBean;
import com.milk.entity.SuplierEntity;
import com.milk.service.SuplierService;

@Controller
public class SuplierController {
	@Autowired
	SuplierService suplierservice;

	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView saveSuplierEntity(@ModelAttribute("command")SuplierBean suplierBean,BindingResult result)
	{
		
		SuplierEntity suplierEntity=prepareModel(suplierBean);
		suplierservice.addSuplier(suplierEntity);
		return new ModelAndView("redirect:/SupplieRegistration.jsp");
		
	}
	
	private SuplierEntity prepareModel(SuplierBean suplierBean) {
		SuplierEntity suplierentity = new SuplierEntity();
		suplierentity.setsName(suplierBean.getSupName());
		suplierentity.setSadd(suplierBean.getAddress());
		suplierentity.setsID(suplierBean.getSupID());
		suplierBean.setSupID(0);
		return suplierentity;
	}
}
