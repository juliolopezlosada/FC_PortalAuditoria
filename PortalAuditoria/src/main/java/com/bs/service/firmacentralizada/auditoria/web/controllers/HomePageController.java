package com.bs.service.firmacentralizada.auditoria.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bs.service.firmacentralizada.auditoria.entidades.Flow;
import com.bs.service.firmacentralizada.auditoria.web.services.FlowService;

@Controller
@RequestMapping("/FlowService")
public class HomePageController {	
	
	@Autowired
	FlowService service;
    
//    @RequestMapping(value = "showMessage")
//    String getAll() {
//    	System.out.println("Antes de llamar al findByid");
//    	service.findById("1");
//    	System.out.println("FIn de llamada a findByid");
//        return "showMessage";
//    }    
    //,headers="Accept=application/xml, application/json" esto puede ser necesario en algun momento, lo dejo comentado
    @RequestMapping(value = "getall", method = RequestMethod.GET)
    @ResponseBody
	public Flow getShopInJSON() {
    	System.out.println("Antes de llamar al getall");
		Flow flow = new Flow();
		flow.setFlowId(1);
		flow.setDescription("cualquier descrp");	
		
		System.out.println("FIn de llamada al getall");
		return flow;

	}   
    
  
}
