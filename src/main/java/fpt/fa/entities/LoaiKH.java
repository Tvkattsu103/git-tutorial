/*
 * (C) Copyright 2022 Fresher Academy. All Rights Reserved
 *
 * @author voanh
 * @date Mar 31, 2022
 * version 1.0
 */
package fpt.fa.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "LoaiKH")
public class LoaiKH {
	@Id
	@GeneratedValue(generator = "my_generator")  
	@GenericGenerator(name = "my_generator", strategy = "fpt.fa.entities.generator.LoaiKHGenerator")
	@Column(name="MaLoaiKH")
	private String maLoaiKH;
	
	@Column(name="TenLoaiKH")
	private String tenLoaiKH;
	
	@Column(name="ChietKhau")
	private int chietKhau;
	
	@OneToMany(mappedBy="loaiKH")
    Set<TTOrder> ttOrder;

	/**
	 * @author voanh @birthday 2000-03-10
	 * @date 2022-03-31
	 */
	public LoaiKH() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @author voanh @birthday 2000-03-10
	 * @date 2022-03-31
	 * @param maLoaiKH
	 * @param tenLoaiKH
	 * @param chietKhau
	 * @param ttOrder
	 */
	public LoaiKH(String maLoaiKH, String tenLoaiKH, int chietKhau, Set<TTOrder> ttOrder) {
		super();
		this.maLoaiKH = maLoaiKH;
		this.tenLoaiKH = tenLoaiKH;
		this.chietKhau = chietKhau;
		this.ttOrder = ttOrder;
	}

	public String getMaLoaiKH() {
		return maLoaiKH;
	}

	public void setMaLoaiKH(String maLoaiKH) {
		this.maLoaiKH = maLoaiKH;
	}

	public String getTenLoaiKH() {
		return tenLoaiKH;
	}

	public void setTenLoaiKH(String tenLoaiKH) {
		this.tenLoaiKH = tenLoaiKH;
	}

	public int getChietKhau() {
		return chietKhau;
	}

	public void setChietKhau(int chietKhau) {
		this.chietKhau = chietKhau;
	}

	public Set<TTOrder> getTtOrder() {
		return ttOrder;
	}

	public void setTtOrder(Set<TTOrder> ttOrder) {
		this.ttOrder = ttOrder;
	}
	
}
