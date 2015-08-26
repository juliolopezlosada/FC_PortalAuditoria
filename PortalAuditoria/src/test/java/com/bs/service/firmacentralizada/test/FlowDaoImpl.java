package com.bs.service.firmacentralizada.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("flowDao")
public class FlowDaoImpl implements FlowDao{
	
	
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public Flow findById(String id) {
		
		return (Flow) getSession().createSQLQuery("Select * from FLOW f where f.flow = '10' ");		
	
	}

}
