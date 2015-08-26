package com.bs.service.firmacentralizada.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("flowService")
@Transactional
public class FlowServiceImpl implements FlowService{

	@Autowired
	private FlowDao dao;
	
	public Flow findById(String id) {
		return dao.findById(id);
	}

}
