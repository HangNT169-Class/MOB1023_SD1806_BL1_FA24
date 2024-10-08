/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B1_OOP.ThucHanh;

/**
 *
 * @author hangnt
 */
public class SinhVien extends Nguoi {

    private String mssv;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String mssv, double diem, String ten, int tuoi, String diaChi) {
        super(ten, tuoi, diaChi);
        this.mssv = mssv;
        this.diem = diem;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("MSSV: " + mssv + " Diem: " + diem);
    }
}
