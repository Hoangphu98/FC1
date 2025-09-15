
package BT;

import java.util.Date;
import java.util.Scanner;

public class SinhVien extends Nguoi {
    private String maSinhVien;
    private String renLuyen;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String renLuyen) {
        this.maSinhVien = maSinhVien;
        this.renLuyen = renLuyen;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getRenLuyen() {
        return renLuyen;
    }

    public void setRenLuyen(String renLuyen) {
        this.renLuyen = renLuyen;
    }
    void danhGiaRenLuyen(){
        int chon;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Danh gia ren luyen: 1-Gioi, 2-Kha, 3-Trung binh, 4-Yeu");
        chon = Integer.parseInt(scanner.nextLine());
        switch(chon){
            case 1:
                System.out.println("Ren luyen gioi.");
                setRenLuyen("Gioi");
                break;
            case 2:
                System.out.println("Ren luyen kha.");
                setRenLuyen("Kha");
                break;
            case 3:
                System.out.println("Ren luyen trung binh.");
                setRenLuyen("Trung binh");
                break;
            case 4:
                System.out.println("Ren luyen yeu.");
                setRenLuyen("Yeu");
                break;
        }
    }
    @Override
    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("Nhap ma sinh vien: ");
        setMaSinhVien(scanner.nextLine());
        System.out.println("Danh gia ren luyen: ");
        danhGiaRenLuyen();
    }
    public void capNhatNguoibangCmnd(int cmnd){
        Scanner scanner = new Scanner(System.in);
        super.capNhatNguoiBangCmnd(cmnd);
        System.out.println("Nhap ma sinh vien: ");
        setMaSinhVien(scanner.nextLine());
        System.out.println("Danh gia ren luyen: ");
        danhGiaRenLuyen();
    }
    public void xuatThongTin(){
        super.xuatThongTin();
        System.out.println(toString());
    }
    @Override
    public void traTienDoXe(){
        System.out.println("Sinh vien: 2000/luot");
    }
}
