package com.milk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.milk.dao.SuplierDao;
import com.milk.entity.SuplierEntity;
@Service("suplierService")
public class SuplierImpl implements SuplierService{

	@Autowired
	private SuplierDao suplierdao;
	public void addSuplier(SuplierEntity suplierentity) {
		suplierdao.addSuplier(suplierentity);
	}

}
