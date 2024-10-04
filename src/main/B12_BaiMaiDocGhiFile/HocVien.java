/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B12_BaiMaiDocGhiFile;

import java.io.Serializable;

/**
 *
 * @author hangnt
 */
public class HocVien implements Serializable{

    // ma- String, ten - String, tuoi - int, nganhHoc - String
    private String ma;
    private String ten;
    private Integer tuoi;
    private String nganhHoc;

    public HocVien() {
    }

    public HocVien(String ma, String ten, Integer tuoi, String nganhHoc) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.nganhHoc = nganhHoc;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
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

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

}
