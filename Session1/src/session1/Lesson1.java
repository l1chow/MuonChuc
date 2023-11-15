package session1;

import java.util.Scanner;

public class Lesson1 {

    public static void main(String[] args) {
        int a, b, min, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 2 so: ");
        a = sc.nextInt();
        b = sc.nextInt();

        min = a < b ? a : b;
        for (i = 2; i < min; i++) {
            if ((a % i) == 0 && (b % i) == 0) {
                break;
            }
        }
        if (i == min) {
            System.out.println("Khong co mau chung nho nhat");
        } else {
            System.out.println("Mau chung nho nhat la: " + i);
        }
    }
}
