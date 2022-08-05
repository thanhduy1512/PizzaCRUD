package com.devcamp.pizza365.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "cOrder")
public class COrder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "order_id", unique = true)
	private String orderId;
	
	@Column(name = "kich_co")
	private String kichCo;
	
	@Column(name = "duong_kinh")
	private String duongKinh;
	
	@Column(name = "suon")
	private int suon;
	
	@Column(name = "salad")
	private String salad;
	
	@Column(name = "loai_pizza")
	private String loaiPizza;
	
	@Column(name = "id_vourcher")
	private String idVourcher;
	
	
	@Column(name = "thanh_tien")
	private int thanhTien;
	
	@Column(name = "giam_gia")
	private int giamGia;
	
	@Column(name = "id_loai_nuoc_uong")
	private String idLoaiNuocUong;
	
	@Column(name = "so_luong_nuoc")
	private int soLuongNuoc;
	
	@Column(name = "ho_ten")
	private String hoTen;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "so_dien_thoai")
	private String soDienThoai;
	
	@Column(name = "dia_chi")
	private String diaChi;
	
	@Column(name = "loi_nhan")
	private String loiNhan;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ngay_tao", nullable = true, updatable = false )
    @CreatedDate
    @CreationTimestamp
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date ngayTao;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ngay_cap_nhat", nullable = true, updatable = false )
    @CreatedDate
    @CreationTimestamp
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date ngayCapNhat;

	public COrder() {
	}

	public COrder(String orderId, String kichCo, String duongKinh, int suon, String salad, String loaiPizza,
			String idVourcher, int thanhTien, int giamGia, String idLoaiNuocUong, int soLuongNuoc, String hoTen,
			String email, String soDienThoai, String diaChi, String loiNhan,  Date ngay_tao, Date ngay_cap_nhat ) {
		this.orderId = orderId;
		this.kichCo = kichCo;
		this.duongKinh = duongKinh;
		this.suon = suon;
		this.salad = salad;
		this.loaiPizza = loaiPizza;
		this.idVourcher = idVourcher;
		this.thanhTien = thanhTien;
		this.giamGia = giamGia;
		this.idLoaiNuocUong = idLoaiNuocUong;
		this.soLuongNuoc = soLuongNuoc;
		this.hoTen = hoTen;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
		this.loiNhan = loiNhan;
		this.ngayTao = ngay_tao;
        this.ngayCapNhat = ngay_cap_nhat;
	}

	public Date getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	public Date getNgayCapNhat() {
		return ngayCapNhat;
	}

	public void setNgayCapNhat(Date ngayCapNhat) {
		this.ngayCapNhat = ngayCapNhat;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getKichCo() {
		return kichCo;
	}

	public void setKichCo(String kichCo) {
		this.kichCo = kichCo;
	}

	public String getDuongKinh() {
		return duongKinh;
	}

	public void setDuongKinh(String duongKinh) {
		this.duongKinh = duongKinh;
	}

	public int getSuon() {
		return suon;
	}

	public void setSuon(int suon) {
		this.suon = suon;
	}

	public String getSalad() {
		return salad;
	}

	public void setSalad(String salad) {
		this.salad = salad;
	}

	public String getLoaiPizza() {
		return loaiPizza;
	}

	public void setLoaiPizza(String loaiPizza) {
		this.loaiPizza = loaiPizza;
	}

	public String getIdVourcher() {
		return idVourcher;
	}

	public void setIdVourcher(String idVourcher) {
		this.idVourcher = idVourcher;
	}

	public int getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(int thanhTien) {
		this.thanhTien = thanhTien;
	}

	public int getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(int giamGia) {
		this.giamGia = giamGia;
	}

	public String getIdLoaiNuocUong() {
		return idLoaiNuocUong;
	}

	public void setIdLoaiNuocUong(String idLoaiNuocUong) {
		this.idLoaiNuocUong = idLoaiNuocUong;
	}

	public int getSoLuongNuoc() {
		return soLuongNuoc;
	}

	public void setSoLuongNuoc(int soLuongNuoc) {
		this.soLuongNuoc = soLuongNuoc;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getLoiNhan() {
		return loiNhan;
	}

	public void setLoiNhan(String loiNhan) {
		this.loiNhan = loiNhan;
	}
	
	
}
