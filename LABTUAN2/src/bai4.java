import java.util.Scanner;

class xeco{
    private String tenchuxe;
    private String loaixe;
    private double giaxe;
    private int dungtich;

    public xeco(String tenchuxe,String loaixe, int dungtich, double giaxe) {
        this.tenchuxe= tenchuxe;
        this.loaixe=loaixe;
        this.giaxe =giaxe;
        this.dungtich =dungtich;
    }

    public double tinhthue() {
        double thue;
        if (dungtich < 100) {
            thue = (giaxe* 1 / 100) / 50 * 10;
        } else if (dungtich <= 200) {
            thue = (giaxe* 3 / 100) / 50 * 10;
        } else {
            thue = (giaxe* 5 / 100) / 50 * 10;
        }
        return thue;
    }

    public void thongtin() {
        System.out.printf("%-20s %-15s %-10d %-15.0f %-15.0f\n", tenchuxe, loaixe, dungtich,giaxe, tinhthue());
    }
}


public class bai4{
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
       xeco[] xe = new xeco[3];
       for (int i = 0; i < 3; i++) {
        System.out.println("nhap thong tin xe " + (i + 1) + ":");
        System.out.print("ten chu xe: ");
        String tenchuxe =kb.nextLine();
        System.out.print("nhap loai xe: ");
        String loaixe =kb.nextLine();
        System.out.print("nhap dung tich(cc): ");
        int dungtich =kb.nextInt();
        System.out.print("nhap gia xe(VND): ");
        double giaxe = kb.nextDouble();
        kb.nextLine();

        xe[i] = new xeco (tenchuxe,loaixe, dungtich, giaxe);
    }

  
    System.out.println("\nbang ke khai thue theo dong xe:");
    System.out.printf("%-20s %-15s %-10s %-15s %-15s\n", "ten chu xe", "loai xe", "dung tich", "tri gia", "thue phai nop");
    System.out.println("=======================================================================================================");
    for (xeco v : xe) {
        v.thongtin();
    }
    kb.close();
}
}
