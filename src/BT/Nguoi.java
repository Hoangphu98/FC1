package BT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Nguoi {

    private String Ten;
    private Date ngaySinh;
    private String gioiTinh;
    private int cmnd;

    public Nguoi() {
    }

    public Nguoi(String Ten, Date ngaySinh, String gioiTinh, int cmnd) {
        this.Ten = Ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        setTen(scanner.nextLine());
        System.out.println("Nhap ngay sinh(dd/MM/yyyy): ");
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        String ngaySinhString = scanner.nextLine();
        try {
            setNgaySinh(f.parse(ngaySinhString));
        } catch (ParseException e) {
            System.out.println("Loi: " + e.getMessage());
        }
        System.out.println("Nhap gioi tinh: ");
        setGioiTinh(scanner.nextLine());
        System.out.println("Nhap CMND: ");
        setCmnd(scanner.nextInt());
    }

    public void capNhatNguoiBangCmnd(int cmnd) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        setTen(scanner.nextLine());
        System.out.println("Nhap ngay sinh(dd/MM/yyyy): ");
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        String ngaySinhString = scanner.nextLine();
        try {
            setNgaySinh(f.parse(ngaySinhString));
        } catch (ParseException e) {
            System.out.println("Loi: " + e.getMessage());
        }
        System.out.println("Nhap gioi tinh: ");
        setGioiTinh(scanner.nextLine());
        setCmnd(cmnd);
    }

    void xuatThongTin() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ho va ten: " + getTen());
        System.out.println("Ngay sinh: " + sdf.format("dd/MM/yyyy"));
        System.out.println("Gioi tinh: " + getGioiTinh());
        System.out.println("CMND: " + getCmnd());
    }

    public abstract void traTienDoXe();
}
