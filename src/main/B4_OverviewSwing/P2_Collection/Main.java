/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B4_OverviewSwing.P2_Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author hangnt
 */
public abstract class Main {
    /**
     * Collection trong Java => la 1 tap hop(interface)
     * de the hien cac doi tuong duoi dang don vi (duy nhat)
     * Collection - root (goc)
     * Trong collection: ArrayList, Tree, Map, Set, List, Linked, Queue...
     * 1. truu tuong
     *  - interface: implment 
     *  - abstract class: giong nhu 1 class thuong: extends
     */
//    public abstract void tinhTong();
    public static void main(String[] args) {
        ArrayList<String>lists = new ArrayList<>();
//        class = new class
        // DI: Dependency : Giam su phu thuoc (3 cach giam su phuc thuoc)
        List<String>list1 = new Vector<>();
        List<String>list2 = new ArrayList<>();
        // List: import: java.util
        // interface = new class
        test(list1);
        test(list2);
    }
    
    public static void test(List<String>s){
        // lam gi thi lam
    }
     public static void test1(List<String>s){
        // lam gi thi lam
    }
}
