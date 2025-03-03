import java.util.Scanner;
class hinhchunhat {
    private double chieudai;
    private double chieurong;
    
    public hinhchunhat(double cd, double cr) {
        this.chieudai = cd;
        this.chieurong = cr;
    }
    public double dientich() {
     return chieudai *chieurong;
    }
    
    public double chuvi() {
    return 2 * (chieudai+ chieurong);
    }
    
    @Override
    public String toString() {
     return"chieudai:" + chieudai+ ",chieurong: " + chieurong + ",dientich: " + dientich() + ",chu vi:" +chuvi();
    }
}

public class bai2{
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        System.out.print("nhapchieudai: ");
        double cd = kb.nextDouble();
        System.out.print("nhapchieurong: ");
        double cr = kb.nextDouble();
        
        hinhchunhat hcn = new hinhchunhat(cd, cr);
        System.out.println(hcn);
        kb.close();
    }
   
}