/*
 * (C) Copyright 2022 Fresher Academy. All Rights Reserved
 *
 * @author voanh
 * @date Mar 25, 2022
 * version 1.0
 */
package fpt.fa.repository;

import java.util.List;

import fpt.fa.entities.LoaiKH;

public interface LoaiKHRepository {
	List<String> getListLoaiKH();

	LoaiKH getLoaiKHById(String maLoaiKH);
//	List<KhachHang> getDonHang();
}
