/*
 * (C) Copyright 2022 Fresher Academy. All Rights Reserved
 *
 * @author NghiaHX
 * @birthDate 25/05/2000
 * @date 2022-03-24
 * version 1.0
 */
package fpt.fa.repository.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fpt.fa.entities.TTOrder;
import fpt.fa.repository.TTOrderRepository;
@Transactional
@Repository
public class TTOrderRepositoryImpl implements TTOrderRepository {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void save(TTOrder ttorder) {
		sessionFactory.getCurrentSession().save(ttorder);
	}
	
	@Override
	public List<TTOrder> getTT() {
		String hql = "select distinct e from TTOrder e";
		Query<TTOrder> query = sessionFactory.getCurrentSession().createQuery(hql, TTOrder.class);
        List<TTOrder> datas = query.getResultList();
        return datas;
	}
	@Override
	public TTOrder getTTById(String id) {
		return sessionFactory.getCurrentSession().find(TTOrder.class, id);
	}
}


