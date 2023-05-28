/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class CanBo {
    private String maCB,hoTen,diaChi;
    public CanBo(){
        
    }
    public CanBo(String maCB,String hoTen,String diaChi){
        this.maCB=maCB;
         this.hoTen= hoTen;
         this.diaChi=diaChi;
    }
    public void setmaCB(String maCB){
        this.maCB=maCB;
    }
    public String getmaCB(){
        return maCB;
    }
     public void sethoTen(String hoTen){
        this.hoTen=hoTen;
    }
    public String gethoTen(){
        return hoTen;
    }
     public void setdiaChi(String diaChi){
        this.diaChi=diaChi;
    }
    public String getdiaChi(){
        return diaChi;
    }
     public void input(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhập Mã Cán Bộ : ");
       this.setmaCB(sc.nextLine());
        System.out.print("Nhập Tên Cán Bộ : ");
       this.sethoTen(sc.nextLine());
        System.out.print("Nhập Địa Chỉ Cán Bộ : ");
       this.setdiaChi(sc.nextLine());
    }
    public void output(){
        System.out.printf("%-15s%-35s%-25s",this.getmaCB(),this.gethoTen(),this.getdiaChi());
    }
    public static void main(String[] args) {
      CanBo a = new CanBo();
      a.input();
      a.output();
    }
}
