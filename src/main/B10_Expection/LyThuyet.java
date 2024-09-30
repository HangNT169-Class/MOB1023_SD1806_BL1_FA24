/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B10_Expection;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class LyThuyet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so:");
////        // C1
////        // try ... catch
//        try {
//            // chua doan code nghi ngo xay ra loi 
//            int number = sc.nextInt();
//            System.out.println("Number = " + number);
//        } catch (Exception e) {
//            // giai phap 
//            System.out.println("Khong dung dinh dang so");
//        } finally {
//            // du thanh cong / that bai => deu nhay vao finally
//            System.out.println("Cuoi cung");
//        }
//        // https://github.com/AnhDT0407/Course-JavaCore/blob/master/Java-Lesson/Java%207/try-with-resources.md 
//        // try..with resource(Java 7)  <=> try...catch...final
//        // Cu phap:
////        try() {
////            
////        } catch (Exception e) {
////        }
//        // Expection: la cha cua tat ca cac loai loi 
//        // Object: la cha cua tat ca cac loai kieu du lieu 
//        // throw ( throws)
//        // Nhap tt cua 1 mang gom 5 phan tu.
//        // In phan tu o vi tri bat ky 
////        int a[] = {5, 4, -1, 2, 3};
////        try {
////            System.out.println(a[10]);
////        } catch (Exception e) {
////            System.out.println("Khong du so phan tu trong mang");
////        }
        // C2: regex
        System.out.println("Moi nhap");
        String number = sc.nextLine();
        // so: \\d ( 0 - 9)
        // chu:
//        [0-9]+ <=> \\d+
//        [a-z A-Z]+
        if (number.matches("[0-9]+")) {
            System.out.println("Day la so");
        } else {
            System.out.println("Day k phai la so");
        }

    }

}
