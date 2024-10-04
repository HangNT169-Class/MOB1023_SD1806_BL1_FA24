/*
 * Clistck nbfs://nbhost/SystemFileSystem/Templates/Licenses/listcense-default.txt to change this listcense
 * Clistck nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B12_BaiMaiDocGhiFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import main.B11_DocGhiFile.NhanVien;

/**
 *
 * @author hangnt
 */
public class HocVienService {

    // Doc ghi file 
    private List<HocVien> list = new ArrayList<>();

    public HocVienService() {
//        list.add(new HocVien("th1", "a", 16, "CNTT"));
//        list.add(new HocVien("th2", "b", 16, "TKDH"));
//        list.add(new HocVien("th3", "c", 15, "QTKS"));
//        list.add(new HocVien("th4", "d", 17, "MKT"));
//        list.add(new HocVien("th5", "e", 16, "CNTT"));
    }

    public List<HocVien> getAll() {
        return list;
    }

    public String ghiDuLieuVaoFile(String path) {
        // Tao file moi 
        File file = new File(path);
        // kiem tra trong 
        if (file.exists() == false) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                return "Ghi file that bai";
            }
        }
        //C1: try...catch..finally
        // => Finally: Dong file 
        // C2: try..with..resource 
        try ( FileOutputStream fos = new FileOutputStream(file); 
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            // Ghi file binh thuong
            for (HocVien hv : list) {
                oos.writeObject(hv);
            }
        } catch (Exception e) {
            return "Ghi file that bai";
        }
        return "Ghi file thanh cong";
    }

    public String docDuLieuVaoFile(String path) {
        File file = new File(path);
        if (file.exists() == false) {
            return " Khong tin thay file";
        }
        try ( FileInputStream fis = new FileInputStream(file); 
                ObjectInputStream ois = new ObjectInputStream(fis);) {
            while (fis.available() > 0) {
                list.add((HocVien) ois.readObject());
            }
        } catch (Exception e) {
            return "Doc file that bai";
        }
        return "Doc file thanh cong";
    }
}
