package com.milk.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.milk.entity.SuplierEntity;
@Repository("suplierDao")
public class SuplierDaoImpl implements SuplierDao{

	@Autowired
	private SessionFactory sessionfact;
	
	public void addSuplier(SuplierEntity suplierentity) {
		sessionfact.getCurrentSession().saveOrUpdate(suplierentity);	
	}

}
