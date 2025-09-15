
package Lec10.Abstractclass.EX;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class Nguoi {
    String ten;
    Date ngay;
    String nSinh;
    String gioiTinh;
    int cccd;
    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        ten = scanner.nextLine();
        System.out.println("Nhap ngay sinh:");
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        try{
            ngay = f.parse(scanner.nextLine());
            nSinh = f.format(ngay);
        }catch(ParseException e){
            
        }
        System.out.println("Gioi tinh: ");
        gioiTinh = scanner.nextLine();
        System.out.println("Nhap cccd: ");
        cccd = scanner.nextInt();
    }
    public void inThongTin(){
        System.out.println("Ten: "+ten);
        System.out.println("Ngay sinh: "+ngay);
        System.out.println("Gioi tinh: "+gioiTinh);
        System.out.println("CCCD: "+cccd);
    }
}
