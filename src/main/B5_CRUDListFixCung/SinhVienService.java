/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B5_CRUDListFixCung;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class SinhVienService {

    // hien thi len table 
    // KHONG CAN QUAN TAM TABLE HIEN THI NTN 
    // DEU LAM VIEC VOI LIST 
    // CHI CAN LIST CO GIA TRI => TABLE SE CO GIA TRI TUONG UNG
    private List<SinhVien> lists = new ArrayList<>();

    public SinhVienService() {
        // khoi tao gia tri trong nay 
        lists.add(new SinhVien("HE130461", "Nguyen van a", 10, "Ha noi", true));
        lists.add(new SinhVien("HE130462", "Nguyen van b", 11, "Ha noi1", true));
        lists.add(new SinhVien("HE130463", "Nguyen van c", 15, "Ha noi2", false));
        lists.add(new SinhVien("HE130464", "Nguyen van d", 12, "Ha noi4", false));
        lists.add(new SinhVien("HE130465", "Nguyen van e", 14, "Ha no6", true));
    }

    public List<SinhVien> getAll() {
        return lists;
    }

    public void removeSinhVien(int index) {
        lists.remove(index);
    }
}
