/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.B1_OOP;

/**
 *
 * @author hangnt
 */
public class LyThuyet {
    /**
     * OOP co 4 tinh chat :
     *  1. Tinh dong goi (access modifier): public, protected, default, private
     *  2. Tinh ke thua : extends : class Con ke thua tu class Cha
     *  3. Tinh da hinh: Cung 1 nhiem vu ( chung ten ham) 
     *      => Thuc thi cac cau lenh khac nhau
     *      => Noi dung trong dau { khac nhau}: body code 
     *      Java: bat dau bang annotation (@)
     *          + @override ( Thuong the hien trong mqh cha con)
     *          + @overload 
     * Chu y: 
     *      Override: O 2 class khac nhau ( nhung phan ke thua nhau )
     *          + Chung ten ham
     *          + Chung kieu du lieu tra ve
     *          + Chung tham so truyen vao ()
     *          + Khac body code
     *      Overload: CHI O TRONG 1 CLASS
     *          + Chung ten ham 
     *          + Chung kieu du lieu tra ve
     *          + Khac tham so truyen vao 
     *          + Khac body code
     *  4. Tinh truu tuong: Kho hieu, k de hieu 
     *      => Che giau di nhung gi phuc tap chi show nhung noi dung ( ten ham)
     * VD: nextLine() => nhiem vu : Nhap chuoi tu ban phim 
     * => K can phai quan tam toi noi dung code cua ham la gi
     *  + interface 
     *  + abstract class
     * generic <T>
     */
    public int tinhTong(int a, int b){
        return a+b;
    }
    
    public int tinhTong(int a,int b,int c){
        return a+b+c;
    }
    
}
