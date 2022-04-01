/*
 * (C) Copyright 2022 Fresher Academy. All Rights Reserved
 *
 * @author voanh
 * @date Mar 25, 2022
 * version 1.0
 */
package fpt.fa.service;

import java.util.List;

import fpt.fa.entities.LoaiKH;

public interface LoaiKHService {
	List<String> getListLoaiKH();
	LoaiKH getLoaiKHById(String maLoaiKH);
//	KhachHang getKHById(String maKH);
//	List<KhachHang> getDonHang();
}
