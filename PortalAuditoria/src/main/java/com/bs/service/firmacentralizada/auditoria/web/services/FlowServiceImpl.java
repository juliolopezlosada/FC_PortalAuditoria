package com.bs.service.firmacentralizada.auditoria.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bs.service.firmacentralizada.auditoria.dao.FlowDao;
import com.bs.service.firmacentralizada.auditoria.entidades.Flow;

@Service("flowService")
@Transactional
public class FlowServiceImpl implements FlowService{

	@Autowired
	private FlowDao dao;
	
	public Flow findById(String id) {
		return dao.findById(id);
	}

}
