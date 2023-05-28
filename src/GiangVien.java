/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class GiangVien extends CanBo {
    private String boMon;
    private int thamNien;
    public GiangVien(){
        
    }
    public GiangVien(String maCB,String hoTen,String diaChi,String boMon,int thamNien){
        super(maCB,hoTen,diaChi);
        this.boMon=boMon;
        this.thamNien=thamNien;
    }
    public void setboMon(String boMon){
        this.boMon=boMon;
    }
    public String getboMon(){
        return boMon;
    }
     public void setthamNien(int thamNien){
        this.thamNien=thamNien;
    }
    public int getthamNien(){
        return thamNien;
    }
    public void input(){
        super.input();
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhập Bộ môn : ");
       this.setboMon(sc.nextLine());
        System.out.print("Nhập Thâm Niên : ");
       this.setthamNien(sc.nextInt());
    }
    public void output(){
        super.output();
         System.out.printf("%-35s%-15d",this.getboMon(),this.getthamNien());
    }
   public static void main(String[] args) {
      GiangVien a = new GiangVien();
      
      a.input();
        System.out.printf("%-15s%-35s%-25s%-35s%-15s","Mã cán bộ","Tên cán bộ","Địa chỉ cán bộ","Bộ môn","Thâm niên");
        System.out.println("");
      a.output();
    }
}
