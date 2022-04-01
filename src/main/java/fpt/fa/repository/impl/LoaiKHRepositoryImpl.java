/*
 * (C) Copyright 2022 Fresher Academy. All Rights Reserved
 *
 * @author voanh
 * @date Mar 25, 2022
 * version 1.0
 */
package fpt.fa.repository.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fpt.fa.entities.LoaiKH;
import fpt.fa.repository.LoaiKHRepository;

@Transactional
@Repository
public class LoaiKHRepositoryImpl implements LoaiKHRepository {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<String> getListLoaiKH() {
		String hql = "select distinct e.maLoaiKH from LoaiKH e";
		Query<String> query = sessionFactory.getCurrentSession().createQuery(hql, String.class);
        List<String> datas = query.getResultList();
        return datas;
//		return sessionFactory.getCurrentSession().createQuery("From Student").list();
	}

	@Override
	public LoaiKH getLoaiKHById(String maLoaiKH) {
		return sessionFactory.getCurrentSession().find(LoaiKH.class, maLoaiKH);
	}
	
//	@Override
//	public List<KhachHang> getDonHang() {
//		String hql = "select distinct e from KhachHang e left join fetch e.donHang";
//		Query<KhachHang> query = sessionFactory.getCurrentSession().createQuery(hql, KhachHang.class);
//        List<KhachHang> datas = query.getResultList();
//        return datas;
//	}
	
//	@Override
//	public KhachHang getKhachHangByMaKH(String maKH) {
//		String hql = "select distinct e from DonHang e left join fetch e.chiTietDonHang where e.maKH =: maKH";
//		Query<KhachHang> query = sessionFactory.getCurrentSession().createQuery(hql, KhachHang.class);
//		query.setParameter("maKH", maKH);
//		KhachHang datas = query.getResultList().get(0);
//        return datas;
//	}
}
