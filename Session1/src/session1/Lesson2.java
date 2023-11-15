package session1;

public class Lesson2 {
    public static void main(String[] args) {
        int limit = 500;

        System.out.println("Các bộ ba Pitago có cạnh không quá 500 là:");
        for (int a = 1; a <= limit; a++) {
            for (int b = a; b <= limit; b++) {
                for (int c = b; c <= limit; c++) {
                    if (a * a + b * b == c * c) {
                        System.out.println("(" + a + ", " + b + ", " + c + ")");
                    }
                }
            }
        }
    }
}
