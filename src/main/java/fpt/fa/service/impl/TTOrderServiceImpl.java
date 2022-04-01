/*
 * (C) Copyright 2022 Fresher Academy. All Rights Reserved
 *
 * @author voanh
 * @date Mar 31, 2022
 * version 1.0
 */
package fpt.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.fa.entities.TTOrder;
import fpt.fa.repository.TTOrderRepository;
import fpt.fa.service.TTOrderService;

@Service
public class TTOrderServiceImpl implements TTOrderService{
private TTOrderRepository repository; 
	
	@Autowired
	public TTOrderServiceImpl(TTOrderRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public void save(TTOrder ttorder) {
		this.repository.save(ttorder);
		
	}
	
	@Override
	public List<TTOrder> getTT() {
		return this.repository.getTT();
	}

	@Override
	public TTOrder getTTById(String id) {
		return this.repository.getTTById(id);
	}
}
