package session1;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        int a, b, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        System.out.print("Nhap doan [a, b]: ");
        a = sc.nextInt();
        b = sc.nextInt();
        
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(b - a + 1) + a;
        }
        
        System.out.println("Mang ngau nhien: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean duong = false;
        boolean am = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] < min){
                min = arr[i];
                duong = true;
            }
            if (arr[i] < 0 && arr[i] > max){
                max = arr[i];
                am = true;
            }
        }
        
        if(duong)
            System.out.println("So duong nho nhat: " + min);
        else
            System.out.println("Khong co so duong nho nhat");
        
        if(am)
            System.out.println("So am lon nhat: " + max);
        else
            System.out.println("Khong co so am lon nhat");
    }
    
}
