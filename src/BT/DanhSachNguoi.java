
package BT;

import java.util.ArrayList;

public class DanhSachNguoi {
    ArrayList<Nguoi> danhSachNguoi = new ArrayList<>();
    public void themDanhSach(Nguoi nguoi){
        nguoi.nhapThongTin();
        danhSachNguoi.add(nguoi);
        System.out.println("Them thanh cong.");
    }
    public void xuatDanhSach(){
        if(danhSachNguoi.size()==0){
            System.out.println("Danh sach rong.");
        }else{
            for(int i=0;i<danhSachNguoi.size();i++){
                danhSachNguoi.get(i).xuatThongTin();
            }
        }
    }
}
