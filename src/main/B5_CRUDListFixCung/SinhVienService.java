/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B5_CRUDListFixCung;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        lists.add(new SinhVien("HE130462", " van b", 11, "Ha noi1", true));
        lists.add(new SinhVien("HE130463", " van c", 15, "Ha noi2", false));
        lists.add(new SinhVien("HE130464", " van d", 12, "Ha noi4", false));
        lists.add(new SinhVien("HE130465", "Nguyen van e", 14, "Ha no6", true));
    }

    public List<SinhVien> getAll() {
        return lists;
    }

    public void removeSinhVien(int index) {
        lists.remove(index);
    }

    public void sapXep() {
        lists.sort((o1, o2) -> {
            return o1.getTen().compareTo(o2.getTen()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
        });
    }

    public List<SinhVien> searchByName(String name) {
        // C1: Tim kiem tuan tu: linear search
//        List<SinhVien> listSearch = new ArrayList<>();
//        // Code 
//        for (SinhVien sv : lists) {
//            if(sv.getTen().contains(name)){
//                // add vao list search
//                listSearch.add(sv);
//            }
//        }
//        return listSearch;
        // C2: Java 8 ( filter ) 
        // https://viblo.asia/p/su-dung-streams-filter-trong-java-8-naQZReedKvx 
        return lists.stream()
                .filter(s -> s.getTen().contains(name))
                .collect(Collectors.toList());
        // tra 1 doi tuong : findFirst
        // max/min: .max / min 
        // dem: .count
        // muon tap hop thanh 1 list: collect
    }

    public String addSinhVien(SinhVien sv) {
        // toan tu 3 ngoi
        if (sv == null) {
            return "Add that bai";
        }
        lists.add(sv);
        return " Add thanh cong";
    }

    public void updateSinhVien(int index, SinhVien sv) {
        lists.set(index, sv);
    }

    public void xoaTheoMa(String ma) {
//        for (SinhVien sv : lists) {
//            if (sv.getMssv().equalsIgnoreCase(ma)) {
//                lists.remove(sv);
//                break;
//            }
//        }
        // C2: remove if
        lists.removeIf(s -> s.getMssv().equalsIgnoreCase(ma));
    }
}
