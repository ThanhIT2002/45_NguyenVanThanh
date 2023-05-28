

import java.util.ArrayList;
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class DanhSach { 
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     int n;
        System.out.print("Nhập số người : ");
        ArrayList<GiangVien> li = new ArrayList<>();
        n=sc.nextInt();
        sc.nextLine();
         
        for(int i=0;i<n;i++){
            GiangVien a = new GiangVien();
            a.input();
            li.add(a);
            System.out.println("-----------------------");
        }
        System.out.printf("%-15s%-35s%-25s%-35s%-15s","Mã cán bộ","Tên cán bộ","Địa chỉ cán bộ","Bộ môn","Thâm niên");
        System.out.println("");
        for(GiangVien temp:li){
            temp.output();
            System.out.println("");
        }
        System.out.println(" các giảng viên thuộc bộ môn Mạng máy tính và Công nghệ ĐPT mà có số năm công tác trên 15 năm");
         System.out.printf("%-15s%-35s%-25s%-35s%-15s","Mã cán bộ","Tên cán bộ","Địa chỉ cán bộ","Bộ môn","Thâm niên");
         System.out.println("");
          for(GiangVien temp:li){
             if(temp.getthamNien()>15&& temp.getboMon().equalsIgnoreCase("Mang may tinh va cong nghe DPT")){
                  temp.output();
            System.out.println("");
             }
            
        }
    }
}
