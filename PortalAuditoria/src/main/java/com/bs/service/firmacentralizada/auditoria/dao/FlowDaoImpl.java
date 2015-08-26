package com.bs.service.firmacentralizada.auditoria.dao;

import org.springframework.stereotype.Repository;

import com.bs.service.firmacentralizada.auditoria.entidades.Flow;

@Repository("flowDao")
public class FlowDaoImpl extends AbstractDao<String, Flow> implements FlowDao{
	
	public Flow findById(String id) {
		return getByKey(id);
	}

}
