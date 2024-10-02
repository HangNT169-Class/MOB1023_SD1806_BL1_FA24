/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B11_DocGhiFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * Tao doi tuong NhanVien gom cac thuoc tinh: ma - String, ten - String,
     * tuoi - int, gioiTinh - boolean va contructor getter setter Yeu cau: Doc
     * ghi file doi tuong Nhan Vien
     */
    public static void main(String[] args) {
        try {
//            new Main().ghiFileObject();
            new Main().docGhiObject();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // ghi du lieu vao file => ham ghi du lieu 
    // OUTPUTSTREAM
    public void ghiFileObject() throws Exception {
        // B1: Tao 1 file moi 
        // File se ghi tao ra ngay trong project
        File file = new File("test.txt");
        // Kiem tra xem file nay da ton tai hay chua 
        if (!file.exists()) {
            try {
                // tao file moi
                file.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }

        // them phan tu vao list 
        List<NhanVien> lists = new ArrayList<>();
        // add cac phan tu vao list 
        lists.add(new NhanVien("NV01", "A", 17, true));
        lists.add(new NhanVien("NV02", "B", 18, false));
        lists.add(new NhanVien("NV03", "C", 19, true));
        lists.add(new NhanVien("NV04", "D", 20, false));
        lists.add(new NhanVien("NV05", "E", 21, true));

        // B3: ghi du lieu ra file
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // B4: ghi tung doi tuong vao file 
        for (NhanVien nv : lists) {
            // viet vao file 
            oos.writeObject(nv);
        }

        // B5: Close file 
        oos.close();
        fos.close();
    }

    public void docGhiObject() throws Exception {
        // B1: Tao doi tuong file 
        File file = new File("test.txt");
        // Kiem tra ton tai
        if (!file.exists()) {
            System.out.println("Khong co file mong muon");
        }
        // B2: Doc file 
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        // B3: Tao doi tuong 
        List<NhanVien> lists = new ArrayList<>();

        // B4: Add phan tu vao list 
        // Kiem tra xem con dong de doc hay khong
        while (fis.available() > 0) {
            lists.add((NhanVien) ois.readObject());
        }

        // Doc ra man hinh
        for (NhanVien nv : lists) {
            System.out.println(nv.toString());
        }

        // B5: Close 
        ois.close();
        fis.close();

    }
}
