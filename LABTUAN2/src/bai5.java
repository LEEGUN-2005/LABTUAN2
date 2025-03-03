import java.util.Scanner;

class Student {
    private String stID;
    private String stName;
    private String stClass;

    public Student() {
        this.stID = "";
        this.stName = "";
        this.stClass = "";
    }

    public Student(String stID, String stName, String stClass) {
        this.stID = stID;
        this.stName = stName;
        this.stClass = stClass;
    }

    public Student(Student st) {
        this.stID = st.stID;
        this.stName = st.stName;
        this.stClass = st.stClass;
    }

    public String getStID() {
        return stID;
    }

    public void setStID(String stID) {
        this.stID = stID;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStClass() {
        return stClass;
    }

    public void setStClass(String stClass) {
        this.stClass = stClass;
    }

    @Override
    public String toString() {
        return "Student ID: " + stID + ", Name: " + stName + ", Class: " + stClass;
    }
}
class Book {
    private String boCode;
    private String boTitle;
    private String boAuthor;

    public Book() {
        this.boCode = "";
        this.boTitle = "";
        this.boAuthor = "";
    }

    public Book(String boCode, String boTitle, String boAuthor) {
        this.boCode = boCode;
      this.boTitle= boTitle;
        this.boAuthor = boAuthor;
    }

    public Book(Book bo) {
this.boCode = bo.boCode;
        this.boTitle = bo.boTitle;
        this.boAuthor = bo.boAuthor;
    }
public String getBoCode() {
        return boCode;
    }
    public String getBoTitle() {
        return boTitle;
    }

    public String getBoAuthor() {
        return boAuthor;
    }

    @Override
    public String toString() {
        return "Book Code: " + boCode + ", Title: " + boTitle + ", Author: " + boAuthor;
    }
}

class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public SanPham() {
        this.tenSp = "";
        this.donGia = 0.0;
        this.giamGia = 0.0;
    }

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp  = tenSp ;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public double getThue() {
        return donGia * 0.1;
    }

    public void nhap(Scanner kb) {
        System.out.print("nhap ten sp: ");
        tenSp = kb.nextLine();
        System.out.print("nhap don gia: ");
        donGia= kb.nextDouble();
        System.out.print("nhap giam gia: ");
        giamGia= kb.nextDouble();
        kb.nextLine(); 
    }

    public void xuat() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ten san pham: " + tenSp+ ", Don gia: " + donGia + ", giam gia: " + giamGia + ", thue nhap khau: " + getThue();
    }
}

public class bai5{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("nhap thong tin sv:");
        System.out.print("nhap ma sv: ");
        String stID = kb.nextLine();
        System.out.print("ten sv: ");
        String stName = kb.nextLine();
        System.out.print("nhap lop: ");
        String stClass = kb.nextLine();
        Student student = new Student(stID, stName, stClass);

       
        System.out.println("\nnhap thong tin sach:");
        System.out.print("nhap ma sach: ");
        String boCode = kb.nextLine();
        System.out.print("nhap ten sach: ");
        String boTitle = kb.nextLine();
        System.out.print("tac gia: ");
        String boAuthor = kb.nextLine();
        Book book = new Book(boCode, boTitle, boAuthor);

        System.out.println("\nNhập thông tin sản phẩm:");
        SanPham sanpham = new SanPham();
        sanpham.nhap(kb);

        
        System.out.println("\n------------------ THÔNG TIN NHẬP ------------------");
        System.out.println("\nthong tin sinh vien:");
        System.out.println(student);

        System.out.println("\nthong tin sach:");
        System.out.println(book);

        System.out.println("\nthong tin sp:");
        sanpham.xuat();

        kb.close();
    }
}
