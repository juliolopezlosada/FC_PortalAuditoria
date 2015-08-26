package com.bs.service.firmacentralizada.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTests {  
	
	FlowService service;	
	private ApplicationContext context;
	
	   @Before
	    public void setUp() throws Exception {
	        context = new ClassPathXmlApplicationContext("classpath:test-context.xml");
	        service = (FlowService) context.getBean("flowService");
	    }
	
	   @Test
	    public void testGetProductList() {
	      Flow flujo = service.findById("10");
	      
	     System.out.println(flujo.getDescription());
	     
	    
	    }


}