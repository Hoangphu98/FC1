package BT;

import java.util.Date;
import java.util.Scanner;

public class GiaoVien extends Nguoi {

    private String maGiaoVien;
    private String loaiThiDua;

    public GiaoVien() {
    }

    public GiaoVien(String maGiaoVien, String loaiThiDua) {
        this.maGiaoVien = maGiaoVien;
        this.loaiThiDua = loaiThiDua;
    }

    public String getMaGiaoVien() {
        return maGiaoVien;
    }

    public void setMaGiaoVien(String maGiaoVien) {
        this.maGiaoVien = maGiaoVien;
    }

    public String getLoaiThiDua() {
        return loaiThiDua;
    }

    public void setLoaiThiDua(String loaiThiDua) {
        this.loaiThiDua = loaiThiDua;
    }

    void xepLoaiThiDua() {
        int chon;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Danh gia thi dua: 1-Loai A, 2-Loai B, 3-Loai C");
        chon = Integer.parseInt(scanner.nextLine());
        switch (chon) {
            case 1:
                System.out.println("Thi dua loai A.");
                setLoaiThiDua("Loai A");
                break;
            case 2:
                System.out.println("Thi dua loai B.");
                setLoaiThiDua("Loai B");
                break;
            case 3:
                System.out.println("Thi dua loai C.");
                setLoaiThiDua("Loai C");
                break;
        }
    }

    @Override
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("Nhap ma giao vien: ");
        setMaGiaoVien(scanner.nextLine());
        System.out.println("Xep loai thi dua: ");
        xepLoaiThiDua();
    }

    public void capNhatNguoibangCmnd(int cmnd) {
        Scanner scanner = new Scanner(System.in);
        super.capNhatNguoiBangCmnd(cmnd);
        System.out.println("Nhap ma giao vien: ");
        setMaGiaoVien(scanner.nextLine());
        System.out.println("Xep loai thi dua: ");
        xepLoaiThiDua();
    }

    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println(toString());
    }

    @Override
    public void traTienDoXe() {
        System.out.println("Giao vien: mien phi");
    }
}
