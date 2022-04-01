/*
 * (C) Copyright 2022 Fresher Academy. All Rights Reserved
 *
 * @author voanh
 * @date Mar 31, 2022
 * version 1.0
 */
package fpt.fa.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "TTOrder")
public class TTOrder {
	@Id
	@GeneratedValue(generator = "my_generator")  
	@GenericGenerator(name = "my_generator", strategy = "fpt.fa.entities.generator.MaOrderGenerator")
	@Column(name="MaOrder")
	private String maOrder;
	
	@Column(name="TenKH")
	private String tenKH;
	
	@Column(insertable=false)
	private String maloaiKH;
	@ManyToOne
    @JoinColumn(name = "MaLoaiKH")
    private LoaiKH loaiKH;
	
	@Column(name="SoDienThoai")
	private String soDienThoai;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name="NgayOrder")
	private Date ngayOrder;
	
	@Min(value = 1, message= "Số người lớn không được nhỏ hơn {value}")
	@Column(name="SoNguoiLon")
	private int soNguoiLon;
	
	@Min(value = 1, message= "Số trẻ em không được nhỏ hơn {value}")
	@Column(name="SoTreEm")
	private int soTreEm;
	
	@DateTimeFormat(pattern = "HH:mm:ss")
	@Column(name="GioVao")
	private Date gioVao;
	
	@Column(name="TienThanhToan")
	private Long tienThanhToan;

	/**
	 * @author voanh @birthday 2000-03-10
	 * @date 2022-03-31
	 */
	public TTOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @author voanh @birthday 2000-03-10
	 * @date 2022-03-31
	 * @param ngayOrder
	 * @param gioVao
	 */
	public TTOrder(Date ngayOrder, Date gioVao) {
		super();
		this.ngayOrder = ngayOrder;
		this.gioVao = gioVao;
	}

	/**
	 * @author voanh @birthday 2000-03-10
	 * @date 2022-03-31
	 * @param maOrder
	 * @param tenKH
	 * @param loaiKH
	 * @param soDienThoai
	 * @param ngayOrder
	 * @param soNguoiLon
	 * @param soTreEm
	 * @param gioVao
	 * @param tienThanhToan
	 */
	public TTOrder(String maOrder, String tenKH, LoaiKH loaiKH, String soDienThoai, Date ngayOrder, int soNguoiLon,
			int soTreEm, Date gioVao, Long tienThanhToan) {
		super();
		this.maOrder = maOrder;
		this.tenKH = tenKH;
		this.loaiKH = loaiKH;
		this.soDienThoai = soDienThoai;
		this.ngayOrder = ngayOrder;
		this.soNguoiLon = soNguoiLon;
		this.soTreEm = soTreEm;
		this.gioVao = gioVao;
		this.tienThanhToan = tienThanhToan;
	}
	
	public String getMaloaiKH() {
		return maloaiKH;
	}

	public void setMaloaiKH(String maloaiKH) {
		this.maloaiKH = maloaiKH;
	}

	public String getMaOrder() {
		return maOrder;
	}

	public void setMaOrder(String maOrder) {
		this.maOrder = maOrder;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public LoaiKH getLoaiKH() {
		return loaiKH;
	}

	public void setLoaiKH(LoaiKH loaiKH) {
		this.loaiKH = loaiKH;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public Date getNgayOrder() {
		return ngayOrder;
	}

	public void setNgayOrder(Date ngayOrder) {
		this.ngayOrder = ngayOrder;
	}

	public int getSoNguoiLon() {
		return soNguoiLon;
	}

	public void setSoNguoiLon(int soNguoiLon) {
		this.soNguoiLon = soNguoiLon;
	}

	public int getSoTreEm() {
		return soTreEm;
	}

	public void setSoTreEm(int soTreEm) {
		this.soTreEm = soTreEm;
	}

	public Date getGioVao() {
		return gioVao;
	}

	public void setGioVao(Date gioVao) {
		this.gioVao = gioVao;
	}

	public Long getTienThanhToan() {
		return tienThanhToan;
	}

	public void setTienThanhToan(Long tienThanhToan) {
		this.tienThanhToan = tienThanhToan;
	}
	
	
}
