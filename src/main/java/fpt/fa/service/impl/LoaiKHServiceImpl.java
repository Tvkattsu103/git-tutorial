/*
 * (C) Copyright 2022 Fresher Academy. All Rights Reserved
 *
 * @author voanh
 * @date Mar 25, 2022
 * version 1.0
 */
package fpt.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.fa.entities.LoaiKH;
import fpt.fa.repository.LoaiKHRepository;
import fpt.fa.service.LoaiKHService;

@Service
public class LoaiKHServiceImpl implements LoaiKHService{
	private LoaiKHRepository repository;

	@Autowired
	public LoaiKHServiceImpl(LoaiKHRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public List<String> getListLoaiKH() {
		return this.repository.getListLoaiKH();
	}

	@Override
	
	public LoaiKH getLoaiKHById(String maLoaiKH) {
		return this.repository.getLoaiKHById(maLoaiKH);
	}
//
//	@Override
//	public List<KhachHang> getDonHang() {
//		return this.repository.getDonHang();
//	}
	
}
