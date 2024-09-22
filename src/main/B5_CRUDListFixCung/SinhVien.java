/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B5_CRUDListFixCung;

/**
 *
 * @author hangnt
 */
public class SinhVien {

    private String mssv;
    private String ten;
    private Integer tuoi;
    private String diaChi;
    private Boolean gioiTinh;

    public SinhVien() {
    }

    public SinhVien(String mssv, String ten, Integer tuoi, String diaChi, Boolean gioiTinh) {
        this.mssv = mssv;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

}
