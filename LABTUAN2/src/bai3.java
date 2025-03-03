import java.util.Scanner;

class sinhvien{
    private int masv;
    private String hoten;
    private float diemlt,diemth;
    
    public sinhvien() {
    this.masv = 0;
    this.hoten= "";
    this.diemlt= 0;
    this.diemth= 0;
    }
    
    public sinhvien(int masv,String hoten,float diemlt,float diemth) {
    this.masv =masv;
this.hoten= hoten;
    this.diemlt= diemlt;
    this.diemth =diemth;
    }
    public float diemtb() {
        return (diemlt + diemth)/ 2;
    }

    @Override
    public String toString() {
        return "\nma sinh vien: " +masv + 
               "\nho ten: " + hoten+ 
               "\ndiem ly thuyet: " +diemlt+ 
               "\ndiem thuc hanh: " +diemth+ 
               "\ndiem trung binh: " +diemtb();
    }
}
public class bai3{
    public static void main(String[] args){
        Scanner kb= new Scanner(System.in);
        System.out.println("nhap ma sinh vien:");
        int masv=kb.nextInt();
        kb.nextLine();
        System.out.println("nhap ho ten:");
        String hoten=kb.nextLine();
        System.out.println("nhap diem ly thuyet:");
        float diemlt=kb.nextFloat();
        System.out.println("nhap diem thuc hanh:");
        float diemth=kb.nextFloat();

    sinhvien sv =new sinhvien(masv,hoten,diemlt,diemth);
    System.out.println("thong tin sinh vien:");
    System.out.println(sv);    
    kb.close();
    }
}