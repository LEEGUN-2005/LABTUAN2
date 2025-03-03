
import java.util.Arrays;
import java.util.Scanner;

public class bai1{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("nhap so luong phan tu: ");
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu" + (i+1) + ": ");
            arr[i] = kb.nextInt();
        }
        
        System.out.println("mang: " + Arrays.toString(arr));
        
        System.out.print("nhap so nguyen can tim: ");
        int x = kb.nextInt();
        System.out.println("vi tri: " + Arrays.toString(Arrays.stream(arr).filter(i -> i == x).toArray()));
        
        System.out.println("gia tri lon nhat: " + Arrays.stream(arr).max().getAsInt());
        System.out.println("gia tri nho nhat: " + Arrays.stream(arr).min().getAsInt());
        System.out.println("mang sau khi sap xep: " + Arrays.toString(Arrays.stream(arr).sorted().toArray()));
    }

}